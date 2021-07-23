<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FirstServlet</title>
</head>
<%!public void jspInit() {
		System.out.println("jsp initialization activities");
	}%>

<h1>First Page Called
	The Server Time is:<%=new java.util.Date()%></h1>
<%!public void jspDestroy() {
		System.out.println("jsp deinitialization activities");
	}%>
</body>
</html>