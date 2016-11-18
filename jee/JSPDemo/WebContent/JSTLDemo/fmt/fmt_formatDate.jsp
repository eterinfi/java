<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:formatDate 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:formatDate&gt; 实例</h1>
  <c:set var="now" value="<%= new java.util.Date() %>" />
  <p>格式化日期 (1)：<fmt:formatDate type="time" value="${now}" /></p>
  <p>格式化日期 (2)：<fmt:formatDate type="date" value="${now}" /></p>
  <p>格式化日期 (3)：<fmt:formatDate type="both" value="${now}" /></p>
  <p>格式化日期 (4)：<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now}" /></p>
  <p>格式化日期 (5)：<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${now}" /></p>
  <p>格式化日期 (6)：<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${now}" /></p>
  <p>格式化日期 (7)：<fmt:formatDate pattern="yyyy-MM-dd" value="${now}" /></p>
</body>
</html>