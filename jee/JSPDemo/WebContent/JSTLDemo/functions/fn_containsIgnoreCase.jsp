<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fn:containsIgnoreCase 函数实例</title>
</head>
<body>
  <h1>fn:containsIgnoreCase() 实例</h1>
  <c:set var="theString" value="I am from runoob" />
  <c:if test="${fn:containsIgnoreCase(theString, 'runoob')}">
    <p>找到 runoob</p>
  </c:if>
  <c:if test="${fn:containsIgnoreCase(theString, 'RUNOOB')}">
    <p>找到 RUNOOB</p>
  </c:if>
</body>
</html>