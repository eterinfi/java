<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSP JavaBean 属性操作实例</title>
</head>
<body>
  <h1>JSP JavaBean 属性操作实例</h1>
  <jsp:useBean id="students" class="jsp.demo.StudentsBean">
    <jsp:setProperty name="students" property="firstName" value="小强" />
    <jsp:setProperty name="students" property="lastName" value="王" />
    <jsp:setProperty name="students" property="age" value="10" />
  </jsp:useBean>
  <p>学生名字：<jsp:getProperty name="students" property="firstName" /></p>
  <p>学生姓氏：<jsp:getProperty name="students" property="lastName" /></p>
  <p>学生年龄：<jsp:getProperty name="students" property="age" /></p>
</body>
</html>