<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Bean</title>
</head>
<body bgcolor=black style="color: #41d141; font-family: 'Courier New';">
	<jsp:useBean id="c" class="model.CustomerBean" />
	<h2>
		Customer Name:
		<jsp:getProperty property="name" name="c" /><br /> Customer Email:
		<jsp:getProperty property="mail" name="c" /><br />

		<jsp:setProperty property="name" name="c" value="pranav" />
		Customer Name After Update:
		<jsp:getProperty property="name" name="c" /><br /> Customer Email:
		<jsp:getProperty property="mail" name="c" />

	</h2>
</body>
</html>