package com.unique.jointrent.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.InternetAddress;




 
public class MailTest 
{
    public static void main( String[] args ) throws Exception
    {

        ApplicationMailSender mm = new ApplicationMailSender();
        long startTime = System.currentTimeMillis();  
        System.out.println("start : " + startTime);
        
        /*//10 email , each 1 recevier 
        for(int i= 0 ;i<10;i++){
            String[] receiverArray = new String[]{"3697762@163.com" , "262800095@qq.com" , "364845300@qq.com"};
            mm.sendMail("uniquesoftTest@gmail.com",
                    receiverArray,
                    "Testing"+i, 
                    "Testing only \n\n Hello Spring Email Sender");
        }*/
        
        
        // 1 email  ,each 5 receivers;
        /*String[] receiverArray = new String[]{"3697762@163.com" , "547353113@qq.com" , "364845300@qq.com" ,"steven.qin@hengsoft.net" ,"stormisover2010@163.com"};
        mm.sendMail("uniquesoftTest@gmail.com",
                receiverArray,
                "Testing", 
                "Testing only \n\n Hello Spring Email Sender");
        */
        
        //10 email  ,each 5 receivers;
        
        
        String[] receiverArray = new String[]{"3697762@163.com" , "547353113@qq.com" , "364845300@qq.com" ,"steven.qin@hengsoft.net" ,"stormisover2010@163.com"};
        File attachement = new File("D:\\jsp_workspace\\JointRent\\src\\main\\java\\com\\unique\\jointrent\\util\\Spring-Mail.xml");
        List<File> fileList = new ArrayList<File>();
        fileList.add(attachement);
        for(int i=0 ;i<2 ; i++){
            
           System.out.println( mm.sendMail(new InternetAddress("test@gmail.com"),
                   receiverArray,
                   "Testing Steven Qin  " + i, 
                   "<h3>Testing only</h3> <br>Hello Spring Email Sender, <br>Steven Qin ." , fileList));
        }
        
        
        
        long endTime = System.currentTimeMillis();
        System.out.println("end : " + endTime);
        System.out.println("use time : " + (endTime - startTime));
        
 
    }
}
