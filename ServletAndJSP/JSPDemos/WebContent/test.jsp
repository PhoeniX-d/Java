<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Testing</title>
</head>
<body bgcolor=black style="color:#47d147; font-family:'Courier New';">
<%@ page import="java.io.*" %>
<%
	PrintWriter pw = response.getWriter();
	out.println("<h2>Java</h2>");
	pw.println("<h2>C++</h2>");
	out.println("<h2>Java</h2>");
	pw.println("<h2>C++</h2>");
	out.println("<h2>Java</h2>");
	pw.println("<h2>C++</h2>");
	out.println("<h2>Java</h2>");
	pw.println("<h2>C++</h2>");
	out.println("<h2>Java</h2>");
	pw.println("<h2>C++</h2>");	
%>

<%-- @include file="FirstJSP.jsp" --%>
<jsp:include page="FirstJSP.jsp" flush="true"/>

<%-- This is important JSP Application --%>
<%-- UserName:<%= request.getParameter("user") %><br> Password:<%= request.getParameter("pwd") %> --%>
<%@page isELIgnored = "false" %>
<h1>User Name:${param.user}</h1>

</body>
</html>