<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:escapeXml 函数实例</title>
</head>
<body>
  <h1>fn:escapeXml() 实例</h1>
  <c:set var="string1" value="This is first string." />
  <c:set var="string2" value="This <abc>is second String.</abc>"/>
  <p>使用 escapeXml() 函数：</p>
  <p>string (1) : ${fn:escapeXml(string1)}</p>
  <p>string (2) : ${fn:escapeXml(string2)}</p>
  <p>不使用 escapeXml() 函数：</p>
  <p>string (1) : ${string1}</p>
  <p>string (2) : ${string2}</p>
</body>
</html>