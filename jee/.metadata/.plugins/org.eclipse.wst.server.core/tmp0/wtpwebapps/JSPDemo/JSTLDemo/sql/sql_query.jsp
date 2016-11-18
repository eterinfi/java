<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL sql:query 标签实例</title>
</head>
<body>
  <h1>&lt;sql:query&gt; 实例</h1>
  <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                     url="jdbc:mysql://localhost:3306/test"
                     user="root" password="" />
  <sql:query dataSource="${snapshot}" var="result">
    SELECT * FROM Employees;
  </sql:query>
  <table border="1" width="100%">
    <tr align="left">
      <th>Employee ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Age</th>
    </tr>
    <c:forEach var="row" items="${result.rows}"><tr>
      <td><c:out value="${row.id}" /></td>
      <td><c:out value="${row.first}" /></td>
      <td><c:out value="${row.last}" /></td>
      <td><c:out value="${row.age}" /></td>
    </tr></c:forEach>
  </table>
</body>
</html>