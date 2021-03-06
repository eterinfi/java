<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>页面访问量</title>
</head>
<body>
  <%
    Integer hitCount = (Integer)application.getAttribute("hitCounter");
    if (hitCount == null || hitCount == 0) {
    	// 第一次访问
    	out.println("欢迎访问菜鸟教程！");
    	hitCount = 1;
    } else {
    	// 返回访问值
    	out.println("欢迎再次访问菜鸟教程！");
    	hitCount++;
    }
    application.setAttribute("hitCounter", hitCount);
  %>
  <p>页面访问量：<%= hitCount %></p>
</body>
</html>