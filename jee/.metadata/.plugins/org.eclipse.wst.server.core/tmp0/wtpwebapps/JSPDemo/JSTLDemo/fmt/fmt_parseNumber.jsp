<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:parseNumber 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:parseNumber&gt; 实例</h1>
  <c:set var="balance" value="1250003.350" />
  <fmt:parseNumber var="i" type="number" value="${balance}" />
  <p>解析数字 (1)：<c:out value="${i}" /></p>
  <fmt:parseNumber var="i" type="number" integerOnly="true" value="${balance}" />
  <p>解析数字 (2)：<c:out value="${i}" /></p>
</body>
</html>