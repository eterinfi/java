<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>菜鸟教程(runoob.com)</title>
</head>
<body>
  <h2>HTTP 请求实例</h2>
  <table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
      <th>Header Name</th><th>Header Value(s)</th>
    </tr>
    <%
      Enumeration<String> headerNames = request.getHeaderNames();
      while(headerNames.hasMoreElements()) {
    	  String paramName = (String)headerNames.nextElement();
    	  String paramValue = request.getHeader(paramName);
    	  out.print("<tr><td>" + paramName + "</td>");
    	  out.println("<td>" + paramValue + "</td></tr>");
      }
    %>
  </table>
</body>
</html>