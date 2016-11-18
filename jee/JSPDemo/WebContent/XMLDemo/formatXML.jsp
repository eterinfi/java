<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSP 格式化 XML 实例</title>
</head>
<body>
  <h1>JSP 格式化 XML 实例</h1>
  <c:import var="xmltext" url="books.xml" />
  <c:import url="style.xsl" var="xslt" />
  <x:transform xml="${xmltext}" xslt="${xslt}" />
</body>
</html>