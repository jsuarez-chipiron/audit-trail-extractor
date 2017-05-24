/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsuarez.downloader;

import com.sforce.soap.partner.Login;
import com.sforce.soap.partner.LoginResponse;
import com.sforce.soap.partner.SforceService;
import com.sforce.soap.partner.Soap;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author jsuarez
 */
public class Manager {

    private static Properties props;
    public static String cookieString;
    public static String orgId;
    public static String instanceUrl;
    public static String fileSeparator;
    public static String downloadDir;
    private static String wsdlUrl;
    protected static List<String> files;

    public static void init() throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("properties.AuditTrailExtractor");
        String propsFile = rb.getString("properties_file");

        props = new Properties();
        props.load(new FileReader(propsFile));

        orgId = props.getProperty("orgId");
        instanceUrl = props.getProperty("instanceUrl");
        fileSeparator = props.getProperty("file_separator");
        wsdlUrl = props.getProperty("wsdl_url");
        
        System.out.println("Properties loaded successfully");
    }

    public static void doLogin() throws Exception {

        SforceService service = new SforceService(new URL(wsdlUrl));
        Soap port = service.getSoap();

        Login login = new Login();
        login.setUsername(props.getProperty("username"));
        login.setPassword(props.getProperty("password"));

        LoginResponse resp = port.login(login);
        cookieString = "oid=" + orgId + "; sid=" + resp.getResult().getSessionId();

        System.out.println("Login successfully");
    }

    public static void getExportDate() {
        boolean continua = true;
        try {
            HttpURLConnection connection = (HttpURLConnection) (new URL(instanceUrl + "/ui/setup/export/DataExportPage/d").openConnection());
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Cookie", cookieString);
            connection.setRequestProperty("X-SFDC-Session", orgId);

            InputStream is = connection.getInputStream();
            byte[] buff = new byte[1024];
            int c = 0;

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            while ((c = is.read(buff, 0, 1024)) != -1) {
                baos.write(buff, 0, c);
            }

            String page = new String(baos.toByteArray(), "UTF-8");

            is.close();
            baos.close();

            connection.disconnect();

            int i = page.indexOf("Schedule Date");
            page = page.substring(i);

            i = page.indexOf("</tr>");

            page = page.substring(51, i - 5);

            page = page.replaceAll("/", "-");

            File dir = new File(props.getProperty("dest_dir") + page);
            if (dir.exists()) {
                System.out.println("The backup retrieve for date " + page + " was already done in the directory: " + dir.getAbsolutePath() + "\nIf you want to repeat it please remove the directory before.");
                System.exit(0);
                continua=false;
            } else {
                dir.mkdir();
                downloadDir = dir.getAbsolutePath();
            }
        } catch (Exception e) {
            if (!continua)
                System.out.println("ERROR: Retrieving backup date\nHint: Check the language is set to English.\nHint: Check there are files to be downloaded");
            System.exit(0);
        }
    }

    public static void getFilesList() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) (new URL(instanceUrl + "/servlet/servlet.OrgExport").openConnection());
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setRequestProperty("Cookie", cookieString);
        connection.setRequestProperty("X-SFDC-Session", orgId);

        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        files = new ArrayList<String>();

        String linea = null;
        while ((linea = br.readLine()) != null) {
            files.add(linea);
        }

        System.out.println("File list extracted successfully");

    }

    public synchronized static String getNextFile() {
        String result = null;
        try {
            result = files.get(0);
            files.remove(0);
        } catch (Exception e) {
            result = null;
        }
        return result;
    }

    public static void downloadFiles() {
        
        DownloadFile df = new DownloadFile("1");
        df.download();

    }

    public static void run() throws Exception {
        Manager.init();
        Manager.doLogin();
        Manager.getExportDate();
        Manager.getFilesList();
        Manager.downloadFiles();
    }

}
