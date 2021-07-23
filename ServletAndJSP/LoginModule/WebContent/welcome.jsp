<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor=black style="font-family: 'Consolas'; color: #41d141;">
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	if (session.getAttribute("user") == null) {
		response.sendRedirect("login.jsp");
	} else {
	%>
	<h1>Welcome ${user}</h1>
	<%
		}
	%>
	<h4>
		<a href="videos.jsp">Videos Here...</a>
	</h4>
	<form action="Logout" method="post">
		<input type="submit" value="Logout" />
	</form>
</body>
</html>