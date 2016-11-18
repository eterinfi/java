<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
  String title = "User Agent Example";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><% out.print(title); %></title>
</head>
<body>
  <center>
    <h1><% out.print(title); %></h1>
  </center>
  <div align="center">
    <p>${header["user-agent"]}</p>
  </div>
</body>
</html>