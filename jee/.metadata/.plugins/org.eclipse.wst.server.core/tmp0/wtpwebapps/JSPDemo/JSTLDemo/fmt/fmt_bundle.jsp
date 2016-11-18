<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:bundle 标签实例</title>
</head>
<body>
  <h1>&lt;fmt:bundle&gt; 实例</h1>
  <fmt:bundle basename="jstl.demo.fmt.Example" prefix="count.">
    <fmt:message key="one" /><br />
    <fmt:message key="two" /><br />
    <fmt:message key="three" /><br />
  </fmt:bundle>
  <fmt:bundle basename="jstl.demo.fmt.Example">
    <fmt:message key="count.one" /><br />
    <fmt:message key="count.two" /><br />
    <fmt:message key="count.three" /><br />
  </fmt:bundle>
</body>
</html>