<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL x:if 标签实例</title>
</head>
<body>
  <h1>&lt;x:if&gt; 实例</h1>
  <c:import var="xmltext" url="books.xml" />
  <x:parse xml="${xmltext}" var="output" />
  <x:if select="$output//book">
    Document has at least one &lt;book&gt; element.
  </x:if>
  <br />
  <x:if select="$output/books[1]/book/price > 100">
    Book prices are very high
  </x:if>
</body>
</html>