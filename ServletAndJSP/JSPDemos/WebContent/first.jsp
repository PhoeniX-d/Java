<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>first.jsp</title>
</head>
<body bgcolor=black style="color:#41d141">
<%
	pageContext.setAttribute("p", "page");
	request.setAttribute("r", "request");
	session.setAttribute("s", "session");
	application.setAttribute("a", "application");
// 	pageContext.forward("second.jsp");
%>
<h2>Find Attribute value: <%=pageContext.findAttribute("a") %></h2>
</body>
</html>