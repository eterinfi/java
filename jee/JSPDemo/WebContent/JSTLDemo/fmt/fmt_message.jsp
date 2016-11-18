<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:message 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:message&gt; 实例</h1>
  <fmt:setLocale value="en" />
  <fmt:setBundle basename="jstl.demo.fmt.Example" var="lang" />
  <fmt:message key="count.one" bundle="${lang}" /><br />
  <fmt:message key="count.two" bundle="${lang}" /><br />
  <fmt:message key="count.three" bundle="${lang}" /><br />
</body>
</html>