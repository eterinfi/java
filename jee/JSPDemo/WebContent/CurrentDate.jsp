<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*, javax.servlet.*, java.text.*" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>显示当前的日期和时间</title>
</head>
<body>
  <h1 align="center">显示当前的日期和时间</h1>
  <%
    Date date = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss E a");
    out.print("<h2 align=\"center\">" + date.toString() + "</h2>");
    out.print("<h2 align=\"center\">" + ft.format(date) + "</h2>");
  %>
</body>
</html>