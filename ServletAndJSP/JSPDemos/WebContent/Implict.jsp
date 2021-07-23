<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit_Object</title>
</head>
<body>
	<jsp:include page="FirstJSP.jsp" />
	<h3 align="center" >Testing Request Object</h3>
	Request User Agent:
	<%=request.getHeader("User-Agent")%>
	</br>
	</br> Request User Language:
	<%=request.getLocale()%>
</body>
</html>