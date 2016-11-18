<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSP 解析 XML 实例</title>
</head>
<body>
  <h1>JSP 解析 XML 实例</h1>
  <c:import var="bookInfo" url="books.xml" />
  <x:parse xml="${bookInfo}" var="output" />
  <b>第一本书的标题</b>：
  <x:out select="$output/books/book[1]/name" />
  <br>
  <b>第二本书的价格</b>：
  <x:out select="$output/books/book[2]/price" />
</body>
</html>