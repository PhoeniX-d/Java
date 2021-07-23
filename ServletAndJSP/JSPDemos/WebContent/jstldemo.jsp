<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers Info</title>
</head>
<body>

${customers}
	<table border=1>
	<tr><th>Customer ID</th><th>Customer Name</th><th>Customer Mail-ID</th></tr>
	<c:forEach items="${customers}" var="c">
		<tr><th>${c.cid}</th><th>${c.name}</th><th>${c.mail}</th></tr>
	</c:forEach>
	</table>
</body>
</html>