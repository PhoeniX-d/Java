<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>second.jsp</title>
</head>
<body bgcolor=black style="color:#41d141">
Page Scope Attribute: <%=pageContext.getAttribute("p") %><br/>
Request Scope Attribute: <%=pageContext.getAttribute("r", 2) %><br/>
Session Scope Attribute: <%=pageContext.getAttribute("s", 3) %><br/>
Application scope AttributeL: <%=pageContext.getAttribute("a", 4) %><br/>
</body>
</html>