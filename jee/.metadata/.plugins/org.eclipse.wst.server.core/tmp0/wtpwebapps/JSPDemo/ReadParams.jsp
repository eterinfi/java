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
  <h1>读取所有表单参数</h1>
  <table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
      <th>参数名</th><th>参数值</th>
    </tr>
    <%
      Enumeration<String> paramNames = request.getParameterNames();
    
      while(paramNames.hasMoreElements()) {
    	  String paramName = (String)paramNames.nextElement();
    	  String paramValue = request.getParameter(paramName);
    	  out.print("<tr><td>" + paramName + "</td>");
    	  out.println("<td>" + paramValue + "</td></tr>");
      }
    %>
  </table>
</body>
</html>