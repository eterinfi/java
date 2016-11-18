<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:setTimeZone 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:setTimeZone&gt; 实例</h1>
  <c:set var="now" value="<%= new java.util.Date() %>" />
  <p>当前时区时间：<fmt:formatDate value="${now}" type="both" 
                                  timeStyle="long" dateStyle="long" /></p>
  <p>修改为 GMT-8 时区：</p>
  <fmt:setTimeZone value="GMT-8" />
  <p>修改后时区时间：<fmt:formatDate value="${now}" type="both"
                                    timeStyle="long" dateStyle="long" /></p>
</body>
</html>