package com.amit;

import java.util.Properties;

import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Demo {

	public static void main(String[] args) {
		
		
		String message ="hii pappu 2";
		String subject="GPSC";
		String from="amitvaghamshi123@gmail.com";
		String to ="bhaveshbaldaniya2002@gmail.com";
		
		for(int i=0;i<100;i++) {
			boolean x= sendEmail(to,from,subject,message);
			System.out.println(x);
		}
		
		
		
	}
	
	
	 public static boolean sendEmail(String to, String from, String subject, String text) {
	        boolean flag = false;

	        //logic
	        //smtp properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.auth", true);
	        properties.put("mail.smtp.starttls.enable", true);
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.host", "smtp.gmail.com");

	        final  String username = "amitvaghamshi123@gmail.com";
	        final String  password = "skytrrnmswkfxpfx";


	        //session
	        
	        Session session=Session.getInstance(properties, new jakarta.mail.Authenticator() {
	        	
	        	@Override
	        	protected PasswordAuthentication getPasswordAuthentication() {
	        		return new PasswordAuthentication(username, password);
	        	}
			});
	       

	        try {

	            Message message = new MimeMessage(session);
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            message.setFrom(new InternetAddress(from));
	            message.setSubject(subject);
	            message.setText(text);
	            Transport.send(message);
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	        return flag;
	    }

	}

