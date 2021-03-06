package web.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendHTMLEmailDemo {
	public static void main(String[] args) {
		// Recipient's addresses
		String to = "gaorui84@gmail.com";
		String cc = "ryangao@msn.com";
		// Sender's address
		String from = "postmaster@localhost";
		// Sender's host name
		String host = "localhost";
		// Get system properties
		Properties properties = System.getProperties();
		// Set mail server
		properties.setProperty("mail.smtp.host", host);
		// Get default session object
		Session session = Session.getDefaultInstance(properties);
		try {
			// Create default MimeMessage object
			MimeMessage message = new MimeMessage(session);
			// Set header's FROM: field
			message.setFrom(new InternetAddress(from));
			// Set header's TO: field
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// Set header's CC: field
			message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
			// Set header's SUBJECT: field
			message.setSubject("This is the Subject Line!");
			// Set message body, using HTML tags
			message.setContent("<h1>This is actual message</h1>", "text/html");
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}