<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Tags</title>
</head>
<body bgcolor=black style="color: #41d141; font-family: 'Courier New';">
	<%
		pageContext.setAttribute("p", "Pawan");
	pageContext.setAttribute("p", "Ravi", 2);
	pageContext.setAttribute("p", "Sahil", 3);
	pageContext.setAttribute("p", "Anil", 4);
	%>
	<h1>${pageScope.p}<br /> ${requestScope.p}<br /> ${sessionScope.p}<br />
		${applicationScope.p}<br /> ${p}<br />
	</h1>
</body>
</html>