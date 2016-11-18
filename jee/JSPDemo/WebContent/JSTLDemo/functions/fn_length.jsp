<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:length 函数实例</title>
</head>
<body>
  <h1>fn:length() 实例</h1>
  <c:set var="string1" value="This is first String."/>
  <c:set var="string2" value="This is second String." />
  <p>字符串长度 (1) : ${fn:length(string1)}</p>
  <p>字符串长度 (2) : ${fn:length(string2)}</p>
</body>
</html>