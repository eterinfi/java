<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL x:choose 标签实例</title>
</head>
<body>
  <h1>&lt;x:choose&gt; 实例</h1>
  <c:import var="xmltext" url="books.xml" />
  <x:parse xml="${xmltext}" var="output" />
  <x:choose>
    <x:when select="$output//book/author = 'ZARA'">
      Book is written by ZARA
    </x:when>
    <x:when select="$output//book/author = 'NUHA'">
      Book is written by NUHA
    </x:when>
    <x:otherwise>
      Unknown author.
    </x:otherwise>
  </x:choose>
</body>
</html>