<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:split 函数实例</title>
</head>
<body>
  <h1>fn:split() 实例</h1>
  <c:set var="string1" value="www runoob com"/>
  <c:set var="string2" value="${fn:split(string1, ' ')}" />
  <c:set var="string3" value="${fn:join(string2, '-')}" />
  <p>string3 字符串： ${string3}</p>
  <c:set var="string4" value="${fn:split(string3, '-')}" />
  <c:set var="string5" value="${fn:join(string4, ' ')}" />
  <p>string5 字符串：${string5}</p>
</body>
</html>