<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is inbox page you can get all mail services</h1>
<!-- If we are getting RequestDispatcher by getNamedDispatcher() method then web container
won't add any attributes in the request scope while forwarding the request. -->
<%@ page import="java.util.*" %>
<%
	out.println("<h1>Forward Request Attributes</h1>");
	Enumeration<String> e = request.getAttributeNames();
	while(e.hasMoreElements())
	{
	String name= (String)e.nextElement();
	Object value = request.getAttribute(name);
	out.println(name+"....."+value+"<br>");
	}
%>
</body>
</html>