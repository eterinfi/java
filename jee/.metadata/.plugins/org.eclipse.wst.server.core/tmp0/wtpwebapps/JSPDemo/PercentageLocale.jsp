<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Locale, java.text.NumberFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
  String title = "Locale Specific Percentage";
  // Get the client's Locale
  Locale locale = request.getLocale();
  NumberFormat nft = NumberFormat.getPercentInstance(locale);
  String formattedPerc = nft.format(0.51);
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
    <p>Formatted Percentage: <% out.print(formattedPerc); %></p>
  </div>
</body>
</html>