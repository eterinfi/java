<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>页面重定向</title>
</head>
<body>
  <h1 align="center">页面重定向</h1>
  <%
    // 重定向到新地址
    String site = new String("http://www.runoob.com");
    response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
  %>
</body>
</html>