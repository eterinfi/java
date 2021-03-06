<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>JSTL c:remove 标签实例</title>
</head>
<body>
  <h1>&lt;c:remove&gt; 实例</h1>
  <c:set var="salary" scope="session" value="${2000*2}" />
  <p>salary 变量值：<c:out value="${salary}" /></p>
  <c:remove var="salary" />
  <p>删除 salary 变量后的值：<c:out value="${salary}" /></p>
</body>
</html>