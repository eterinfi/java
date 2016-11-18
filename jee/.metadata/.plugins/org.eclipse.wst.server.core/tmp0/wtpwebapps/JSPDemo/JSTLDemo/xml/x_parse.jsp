<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL x:parse 标签实例</title>
</head>
<body>
  <h1>&lt;x:parse&gt; 实例</h1>
  <c:import var="bookInfo" url="books.xml" />
  <x:parse xml="${bookInfo}" var="output" />
  <b>The title of the first book is</b>:
  <x:out select="$output/books/book[1]/name" />
  <br>
  <b>The price of the second book is</b>:
  <x:out select="$output/books/book[2]/price" />
</body>
</html>