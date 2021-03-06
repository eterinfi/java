<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>JSTL c:param 标签实例</title>
</head>
<body>
  <h1>&lt;c:param&gt; 实例</h1>
  <c:url var="myURL" value="main.jsp">
    <c:param name="name" value="Runoob" />
    <c:param name="url" value="www.runoob.com" />
  </c:url>
  <a href="/<c:out value="${myURL}"/>">使用 &lt;c:param&gt; 为指定 URL 发送两个参数。</a>
</body>
</html>