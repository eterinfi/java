package web.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendAttachedEmailDemo {
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
			// Create multipart
			Multipart multipart = new MimeMultipart();
			// Part 1: Message body
			BodyPart messageBodyPart = new MimeBodyPart(); // Create message body
			messageBodyPart.setText("This is actual message"); // Set message body
			multipart.addBodyPart(messageBodyPart); // Add message body part
			// Part 2: Attachment
			BodyPart attachmentPart = new MimeBodyPart(); // Create attachment
			String filename = "file.txt"; // Set source filename
			DataSource source = new FileDataSource(filename); // Locate source file
			attachmentPart.setDataHandler(new DataHandler(source)); // Set data handler
			attachmentPart.setFileName(filename); // Set displayed filename
			multipart.addBodyPart(attachmentPart); // Add attachment part
			// Set multipart message
			message.setContent(multipart);
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}