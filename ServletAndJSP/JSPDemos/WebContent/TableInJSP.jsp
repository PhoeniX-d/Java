<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TableInJSP</title>
</head>
<body bgcolor=green text=white>
	<table border=2>
		<tr>
			<th>NUMBER</th>
			<th>VALUE</th>
		</tr>
		<%
			for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<td>NUMBER:</td>
			<td><%=5 * i%></td></tr> <%
 	}
 %>
	</table>
</body>
</html>