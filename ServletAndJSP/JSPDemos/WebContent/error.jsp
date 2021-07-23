<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	<%@ page isErrorPage="true"%>
	<h1>
		Currently we are facing some problems plz try after some time The
		problem is:
		<%=exception%></h1>
</body>
</html>