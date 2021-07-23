<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
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
	<h4>My Videos Collection</h4>
	<h4>1.Database By Navin Reddy</h4>

	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/y_YxwyYRJek"
		title="YouTube video player" frameborder="1"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
	<br />
	<%
		}
	%>
	<br />
	<form action="Logout" method="post">
		<input type="submit" value="Logout" />
	</form>
</body>
</html>