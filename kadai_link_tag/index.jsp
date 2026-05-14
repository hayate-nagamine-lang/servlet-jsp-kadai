<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Servlet/JSP課題</title>
	</head>
	<body>
	
	<h2>Servletからのメッセージ表示</h2>
	<a href="<%= request.getContextPath() %>/LinkServlet?name=侍太郎">名前「侍太郎」をServletに送信</a>
	
	<%-- リクエストスコープを取得 --%>
<% 
String message = (String) request.getAttribute("message");

if (message != null) {
    %>
        <p><%= message %></p>
    <%
        }
%>	
	
	
	</body></html>
	