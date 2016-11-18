<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Locale" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
  // Set response content type
  response.setContentType("text/html");
  // Set Spanish language code
  response.setHeader("Content-Language", "es");
  String title = "En Espa&ntilde;ol";
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title><% out.print(title); %></title>
</head>
<body>
  <center>
    <h1><% out.print(title); %></h1>
  </center>
  <div align="center">
    <p>En Espa&ntilde;ol:</p>
    <p>&iexcl;Hola Mundo!</p>
  </div>
</body>
</html>