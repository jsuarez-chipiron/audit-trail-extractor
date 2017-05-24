/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsuarez.downloader;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.ScriptResult;
import com.gargoylesoftware.htmlunit.TextPage;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.sforce.soap.partner.Login;
import com.sforce.soap.partner.LoginResponse;
import com.sforce.soap.partner.SforceService;
import com.sforce.soap.partner.Soap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static String sid;
    public static String instanceUrl;    
    public static String downloadDir;
    private static String wsdlUrl;
    public static String workDir;
    
    protected static List<String> files;

    public static void init() throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("properties.AuditTrailExtractor");
        String propsFile = rb.getString("properties_file");

        props = new Properties();
        props.load(new FileReader(propsFile));

        orgId = props.getProperty("orgId");
        instanceUrl = props.getProperty("instanceUrl"); 
        workDir = props.getProperty("work_dir");
        wsdlUrl = "file://"+workDir+"/AuditTrailExtractor/src/main/resources/partner.wsdl";
        
        System.out.println("Properties loaded successfully");
    }

    public static void doLogin() throws Exception {

        SforceService service = new SforceService(new URL(wsdlUrl));
        Soap port = service.getSoap();

        Login login = new Login();
        login.setUsername(props.getProperty("username"));
        login.setPassword(props.getProperty("password"));

        LoginResponse resp = port.login(login);
        sid = resp.getResult().getSessionId();
        cookieString = "oid=" + orgId + "; sid=" + sid;

        System.out.println("Login successfully");
    }

    public static String getAuditURL() { 
        String aUrl = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) (new URL(instanceUrl + "/setup/org/orgsetupaudit.jsp?setupid=SecurityEvents&retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity").openConnection());
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

            aUrl = page.substring(page.indexOf("/servlet/servlet.SetupAuditTrail?id=")); 
            aUrl = aUrl.substring(0,aUrl.indexOf("\""));
            
        } catch (Exception e) {            
            System.out.println("ERROR: "+e.getMessage());
            System.exit(0);
        }
        return aUrl;
    }   
    
    public static void getAuditCSV() throws Exception {
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);
        
        HtmlPage loginPage = webClient.getPage(instanceUrl + "/setup/org/orgsetupaudit.jsp?setupid=SecurityEvents&retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity");
        
        HtmlForm loginForm = (HtmlForm) loginPage.getFormByName("login");
        
        HtmlInput username = (HtmlInput) loginForm.getInputByName("username");
        username.setValueAttribute(props.getProperty("username"));
        
        HtmlInput password = (HtmlInput) loginForm.getInputByName("pw");
        password.setValueAttribute(props.getProperty("password"));
        
        HtmlInput submit = (HtmlInput) loginForm.getInputByName("Login");
        HtmlPage downloadPage = (HtmlPage) submit.click();
               
        ScriptResult result = downloadPage.executeJavaScript("window.location.href='https://jadm.my.salesforce.com/setup/org/orgsetupaudit.jsp?retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity&setupid=SecurityEvents\"):window.location.href=\"https://jadm.my.salesforce.com/setup/org/orgsetupaudit.jsp?retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity&setupid=SecurityEvents'");
        
        HtmlPage page3 = (HtmlPage) result.getNewPage();
                
        List<HtmlAnchor> anchors = page3.getAnchors();
        HtmlAnchor aOut = null;
        for (HtmlAnchor anchor: anchors){
//            System.out.println("anchor = " + anchor.getHrefAttribute());
            if (anchor.getHrefAttribute().contains("servlet/servlet.SetupAuditTrail?id=") ){
                aOut = anchor;
                break;
            }
        }
        
        System.out.println("aOut = " + aOut.getHrefAttribute());
        TextPage page4 = (TextPage) aOut.click();
        
        String csvContent = page4.getContent();
        System.out.println("page4 = " + csvContent);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String today = sdf.format(new Date());
        
        String filename = workDir+File.separator+today+"_audit.csv";

        FileWriter fw = new FileWriter(filename);
        fw.write(csvContent);
        fw.flush();
        fw.close();

        System.out.println("Audit file writed successfully");

    }

    public static void run() throws Exception {
        Manager.init();
        Manager.getAuditCSV();
        
        
    }

}
