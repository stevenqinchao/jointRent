package com.unique.jointrent.util;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unique.jointrent.service.UserService;

public class JMSTest {

    /**
     * method description goes here
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("servlet-context.xml");  
        UserService userService = (UserService) ctx.getBean("userService");
        userService.exception();
    }
}
