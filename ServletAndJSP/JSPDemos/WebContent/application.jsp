<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
</head>
<body bgcolor=black style="color:#47d147; font-family:'Courier New';">
<h2>
	The Context parameter User Name: <%= application.getInitParameter("name") %><br/>
	The Application Name: <%= application.getServletContextName() %>
</h2>

</body>
</html>