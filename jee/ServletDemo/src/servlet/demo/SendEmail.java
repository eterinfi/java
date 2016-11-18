package servlet.demo;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.mail.*;
import javax.mail.internet.*;

@WebServlet("/com/runoob/test/SendEmail")
public class SendEmail extends HttpServlet{
  private static final long serialVersionUID = 1L;
    
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // 收件人的电子邮件 ID
	  String to = "gaorui84@gmail.com";
      String cc = "ryangao@msn.com";
 
      // 发件人的电子邮件 ID
      String from = "postmaster@localhost";
 
      // 假设您是从本地主机发送电子邮件
      String host = "localhost";
 
      // 获取系统的属性
      Properties properties = System.getProperties();
 
      // 设置邮件服务器
      properties.setProperty("mail.smtp.host", host);
 
      // 获取默认的 Session 对象
      Session session = Session.getDefaultInstance(properties);
      
      // 设置响应内容类型
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      try{
         // 创建一个默认的 MimeMessage 对象
         MimeMessage message = new MimeMessage(session);
         // 设置 FROM 字段
         message.setFrom(new InternetAddress(from));
         // 设置 TO 字段
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		 // 设置 CC 字段
		 message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
         // 设置 SUBJECT 字段
         message.setSubject("This is the Subject Line!");
         // 设置文本正文
         message.setText("This is actual message");
         // 发送消息
         Transport.send(message);
         String title = "发送电子邮件";
         String res = "成功发送消息...";
         String docType = "<!DOCTYPE html> \n";
         out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor=\"#f0f0f0\">\n" +
         "<h1 align=\"center\">" + title + "</h1>\n" +
         "<p align=\"center\">" + res + "</p>\n" +
         "</body></html>");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
} 