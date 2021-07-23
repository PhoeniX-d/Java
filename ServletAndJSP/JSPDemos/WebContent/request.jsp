<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request</title>
</head>
<body bgcolor=black style="color:#47d147; font-family:'Courier New';">
<h3>The Request MethodL <%= request.getMethod() %><br/>
User Name: <%= request.getParameter("user") %><br/>
Client IP Address: <%= request.getRemoteAddr() %><br/>
Content Type: <%=response.getContentType() %>
</h1>
</body>
</html>