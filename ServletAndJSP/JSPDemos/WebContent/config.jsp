<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=black style="color:#47d147; font-family:'Courier New';">
<h3>The Logical Name: <%= config.getServletName() %><br/>
The Init Param value is:
<%= config.getInitParameter("State") %>
</h3></body>
</html>