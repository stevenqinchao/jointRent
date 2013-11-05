package com.unique.jointrent.util;

import java.io.File;
import java.util.List;
import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author admin
 * 
 */
public class ApplicationMailSender {

    /**
     * set Email Sender
     * 
     * @param mailSender
     * @return
     */
    public JavaMailSenderImpl setMailSender(JavaMailSenderImpl mailSender) {

        String host = "smtp.gmail.com";
        int port = 587;
        String username = "uniquesoftTest@gmail.com";
        String password = "q262800095";
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.auth", true);

        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setUsername(username);
        mailSender.setPassword(password);
        mailSender.setProtocol("smtp");
        mailSender.setJavaMailProperties(props);

        return mailSender;
    }

    /**
     * sendMail with attachement , ccAddress
     * 
     * @param from
     * @param to
     * @param subject
     * @param content
     * @param attachments
     * @param cclistAddresses
     * @return
     */
    public boolean sendMail(InternetAddress from, String[] to, String subject, String content, List<File> attachments,
                            String[] cclistAddresses) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        this.setMailSender(mailSender);

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            helper.setCc(cclistAddresses);
            for (File file : attachments) {
                helper.addAttachment(file.getName(), file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        mailSender.send(mimeMessage);
        return true;
    }

    /**
     * sendMail without attachement , without ccList
     * 
     * @param from
     * @param to
     * @param subject
     * @param content
     * @return
     */
    public boolean sendMail(InternetAddress from, String[] to, String subject, String content) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        this.setMailSender(mailSender);

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        mailSender.send(mimeMessage);
        return true;
    }

    /**
     * sendMail with attachement , without ccAddress
     * 
     * @param from
     * @param to
     * @param subject
     * @param content
     * @param attachments
     * @return
     */
    public boolean sendMail(InternetAddress from, String[] to, String subject, String content, List<File> attachments) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        this.setMailSender(mailSender);

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            for (File file : attachments) {
                helper.addAttachment(file.getName(), file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        mailSender.send(mimeMessage);
        return true;
    }

    /**
     * sendMail without attachement , with ccList
     * 
     * @param from
     * @param to
     * @param subject
     * @param content
     * @param cclistAddresses
     * @return
     */
    public boolean sendMail(InternetAddress from, String[] to, String subject, String content, String[] cclistAddresses) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        this.setMailSender(mailSender);

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            helper.setCc(cclistAddresses);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        mailSender.send(mimeMessage);
        return true;
    }
}
