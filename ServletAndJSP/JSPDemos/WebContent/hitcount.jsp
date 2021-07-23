<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HitCount</title>
</head>
<body bgcolor=black style="color:#41d141;font-family:'Courier New';">
<%
	Integer count = (Integer)application.getAttribute("hitcount");
	if(count == null){
		count = 1;
	}
	else{
		count++;
	}
	application.setAttribute("hitcount", count);
%>
<h1>Hit count of the application is:<%= count %></h1>

</body>
</html>