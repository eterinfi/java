<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:startsWith 函数实例</title>
</head>
<body>
  <h1>fn:startsWith() 实例</h1>
  <c:set var="theString" value="Runoob: I am from runoob." />
  <c:if test="${fn:startsWith(theString, 'Google')}">
    <p>字符串以 Google 开头</p>
  </c:if>
  <c:if test="${fn:startsWith(theString, 'Runoob')}">
    <p>字符串以 Runoob 开头</p>
  </c:if>
</body>
</html>