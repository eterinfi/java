<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>JSTL c:if 标签实例</title>
</head>
<body>
  <h1>&lt;c:if&gt; 实例</h1>
  <c:set var="salary" scope="session" value="${2000*2}" />
  <c:if test = "${salary > 2000}">
    <p>我的工资为：<c:out value="${salary}" /></p>
  </c:if>
</body>
</html>