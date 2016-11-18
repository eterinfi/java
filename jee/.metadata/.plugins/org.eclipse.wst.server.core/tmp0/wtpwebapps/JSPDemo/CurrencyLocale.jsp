<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Locale, java.text.NumberFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
  String title = "Locale Specific Currency";
  // Get the client's Locale
  Locale locale = request.getLocale();
  NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
  String formattedCurr = nft.format(1000000);
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
    <p>Formatted Currency: <% out.print(formattedCurr); %></p>
  </div>
</body>
</html>