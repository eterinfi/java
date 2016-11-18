<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.net.*" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>删除 Cookie 实例</title>
</head>
<body>
  <%
    Cookie cookie = null;
    Cookie[] cookies = null;
    // 读取 cookie 数据，是一个数组
    cookies = request.getCookies();
    if (cookies != null) {
    	out.println("<h2>查找 Cookie 名称和值</h2>");
    	for (int i = 0; i < cookies.length; i++){
    		cookie = cookies[i];
    		if((cookie.getName()).compareTo("name") == 0 ){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                out.print("删除 Cookie：" + cookie.getName() + "<br/>");
            }
            out.print("参数名称：" + cookie.getName() + "，");
            out.print("参数值：" + new String(URLDecoder.decode(cookie.getValue(), "utf-8").getBytes("ISO8859-1"), "UTF-8") + " <br/>");
        }
    } else
        out.println("<h2>没有发现 Cookie</h2>");
  %>
</body>
</html>