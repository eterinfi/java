<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:parseDate 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:parseDate&gt; 实例</h1>
  <c:set var="now" value="20-10-2015" />
  <fmt:parseDate var="parsedDate" pattern="dd-MM-yyyy" value="${now}" />
  <p>解析后的日期：<c:out value="${parsedDate}" /></p>
</body>
</html>