/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsuarez.downloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jsuarez
 */
public class DownloadFile {
    
    private final String threadId;
    private final String today;
    
    public DownloadFile(String threadId){    
        this.threadId = threadId;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        today = sdf.format(new Date());
    }
    
    public void download(){
        try{
            String file = null;
            int i=0;
            while ((file=Manager.getNextFile())!=null){
                System.out.println("Thread ["+threadId+"] == Downloading file: "+file);
                HttpURLConnection connection = (HttpURLConnection)(new URL(Manager.instanceUrl+file).openConnection());
                connection.setRequestProperty("Connection", "Keep-Alive");
                connection.setRequestProperty("Cookie", Manager.cookieString );
                connection.setRequestProperty("X-SFDC-Session", Manager.orgId );

                InputStream is = connection.getInputStream();

                i++;
                String fileName = today+"_t"+threadId+"_"+String.valueOf(i)+".zip";
                
                //System.out.println(Manager.downloadDir+Manager.fileSeparator+fileName);
                
                FileOutputStream fos = new FileOutputStream(Manager.downloadDir+Manager.fileSeparator+fileName);        

                byte[] buff = new byte[10485760];
                int c = 0;

                while ((c=is.read(buff, 0, 10485760)) != -1){
                    fos.write(buff, 0, c);
                }

                is.close();
                fos.close();
                
                connection.disconnect();
            }
            System.out.println("Thread ["+threadId+"] == END");
        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
}
