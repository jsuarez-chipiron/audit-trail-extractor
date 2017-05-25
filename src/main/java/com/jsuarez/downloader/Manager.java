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
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    public static String instanceUrl;        
    
    public static String workDir;
    
    protected static List<String> files;

    public static void init() throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("properties.AuditTrailExtractor");
        String propsFile = rb.getString("properties_file");

        props = new Properties();
        props.load(new FileReader(propsFile));
        
        instanceUrl = props.getProperty("instanceUrl"); 
        workDir = props.getProperty("work_dir");        
        
        System.out.println("Properties loaded successfully");
    }
            
    public static void getAuditCSV() throws Exception {
        
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);
        System.out.println("25%");
        
        HtmlPage loginPage = webClient.getPage(instanceUrl + "/setup/org/orgsetupaudit.jsp?setupid=SecurityEvents&retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity");        
        System.out.println("50%");
        
        System.err.println(loginPage.asXml());
        
        HtmlForm loginForm = (HtmlForm) loginPage.getFormByName("login");
        
        HtmlInput username = (HtmlInput) loginForm.getInputByName("username");
        username.setValueAttribute(props.getProperty("username"));
        
        HtmlInput password = (HtmlInput) loginForm.getInputByName("pw");
        password.setValueAttribute(props.getProperty("password"));
        
        HtmlInput submit = (HtmlInput) loginForm.getInputByName("Login");
        HtmlPage downloadPage = (HtmlPage) submit.click();
        System.err.println(downloadPage.asXml());
                               
        ScriptResult result = downloadPage.executeJavaScript("window.location.href='/setup/org/orgsetupaudit.jsp?retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DSecurity&setupid=SecurityEvents'");
        
        HtmlPage page3 = (HtmlPage) result.getNewPage();
        System.out.println("75%");
        System.err.println(page3.asXml());
                
        List<HtmlAnchor> anchors = page3.getAnchors();
        HtmlAnchor aOut = null;
        for (HtmlAnchor anchor: anchors){

            if (anchor.getHrefAttribute().contains("servlet/servlet.SetupAuditTrail?id=") ){
                System.err.print(anchor.getHrefAttribute());
                aOut = anchor;
                break;
            }
        }                
                
        TextPage page4 = (TextPage) aOut.click();  
                        
        String csvContent = page4.getContent();
        
        System.err.println(csvContent);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String today = sdf.format(new Date());
        
        String filename = workDir+File.separator+today+"_audit.csv";

        FileWriter fw = new FileWriter(filename);
        fw.write(csvContent);
        fw.flush();
        fw.close();

        System.out.println("Audit file writed successfully");

    }

    public static void run() {
        try {
            Manager.init();
        } catch (IOException ex) {
            System.out.println("An error occurs: "+ex.getMessage());
            System.exit(1);
        }
        try {
            Manager.getAuditCSV();
        } catch (Exception ex) {
            System.out.println("An error occurs: "+ex.getMessage());
            System.exit(1);
        }
    }

}
