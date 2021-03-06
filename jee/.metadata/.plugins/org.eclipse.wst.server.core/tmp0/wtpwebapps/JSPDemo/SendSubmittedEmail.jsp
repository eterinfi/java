<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*, javax.mail.*" %>
<%@ page import="javax.mail.internet.*, javax.activation.*" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%
  String result;
  // 获取表单提交的收件人地址
  String to = request.getParameter("to");
  // 获取表单提交的发件人地址
  String from = request.getParameter("from");
  // 获取表单提交的邮件标题
  String subject = new String(request.getParameter("subject").getBytes("ISO-8859-1"), "UTF-8");
  // 获取表单提交的邮件文本正文
  String messageText = new String(request.getParameter("body").getBytes("ISO-8859-1"), "UTF-8");
  // 获取邮件服务器地址
  String host = request.getParameter("host");
  if (host == null || host == "") host = "localhost";
  // 获取邮件服务器登陆用户名
  String usr = request.getParameter("user");
  // 获取邮件服务器登陆密码
  String pwd = request.getParameter("password");
  // 获取系统属性对象
  Properties properties = System.getProperties();
  // 设置邮件服务器地址
  properties.setProperty("mail.smtp.host", host);
  // 设置邮件服务器登陆用户名
  properties.setProperty("mail.user", usr);
  // 设置邮件服务器登陆密码
  properties.setProperty("mail.password", pwd);
  // 获取默认的 Session 对象
  Session mailSession = Session.getDefaultInstance(properties);
  
  try {
	  // 创建一个默认的 MimeMessage 对象
	  MimeMessage message = new MimeMessage(mailSession);
	  // 设置 FROM 字段
	  message.setFrom(new InternetAddress(from));
	  // 设置 TO 字段
	  message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	  // 设置 SUBJECT 字段
	  message.setSubject(subject);
	  // 设置文本消息正文
	  message.setText(messageText);
	  // 发送消息
	  Transport.send(message);
	  result = "成功发送消息....";
  } catch (MessagingException mex) {
	  mex.printStackTrace();
	  result = "错误：无法发送消息....";
  }
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>使用 JSP 发送电子邮件</title>
</head>
<body>
  <center>
    <h1>使用 JSP 发送电子邮件</h1>
  </center>
  <center>
    <p><% out.println("发送结果：" + result + "\n"); %></p>
  </center>
</body>
</html>