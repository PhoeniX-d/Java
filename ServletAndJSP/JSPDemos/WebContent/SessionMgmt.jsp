<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To-Do-List</title>
</head>
<body>
	<form action="SessionMgmt.jsp">
		Add New Item: <input type="text" name="theItem" /> <input
			type="submit" value="Submit" />
	</form>
	<%@ page import="java.util.*" %>
	<%
		List<String> items = (List<String>) session.getAttribute("myToDoList");
		session.setMaxInactiveInterval(10);
		if(items == null){
			items = new ArrayList<String>();
		}session.setAttribute("myToDoList", items);
			String theItem = request.getParameter("theItem");
			
			out.println(session.getMaxInactiveInterval());
			if(theItem != null){
				items.add(theItem);
		}
	%>
	<hr>
	<strong>To Do Items:</strong><br/>
	<ol>
		<%
			for(String temp: items){
				out.println("<li>" + temp + "</li>");
			}
		%>
	</ol>
</body>
</html>