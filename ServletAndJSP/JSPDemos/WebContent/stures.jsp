<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Response</title>
</head>
<body>
	<%!String first = null;
	String last = null;%>
	<%
		first = request.getParameter("firstName");
	%>
	<%
		last = request.getParameter("lastName");
	%>

	<h3>
		Hello..
		<%=first + "  " + last%></h3>
	You are from:
	<%=request.getParameter("country")%><br />
	Your favorite programming languages:
	<ul>

		<%
			String[] langs = request.getParameterValues("favSubject");

		for (String tempLang : langs)

		{

			out.println("<li>" + tempLang + "</li>");

		}
		%>
	</ul>
</body>
</html>