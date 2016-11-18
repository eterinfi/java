<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:toUpperCase 函数实例</title>
</head>
<body>
  <h1>fn:toUpperCase() 实例</h1>
  <c:set var="string1" value="I am from runoob" />
  <c:set var="string2" value="${fn:toUpperCase(string1)}" />
  <p>大写的字符串：${string2}</p>
</body>
</html>