<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.logging.Logger" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Logger.info</title>
</head>
<body>
  <% Logger logger = Logger.getLogger(this.getClass().getName()); %>
  <c:forEach var="counter" begin="1" end="10" step="1">
    <c:set var="myCount" value="${counter - 5}" />
    <c:out value="${myCount}" /><br>
    <%
      String message = "counter=" + pageContext.findAttribute("counter") +
                       " myCount=" + pageContext.findAttribute("myCount");
      logger.info(message);
    %>
  </c:forEach>
</body>
</html>