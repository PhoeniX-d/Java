<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor=black style="font-family: 'Consolas'; color: #00ff00;">
	<form action="Login" method="post">
		<table>
			<tr>
				<th style="padding: 10px" colspan="2" align="center">Login</th>
			</tr>
			<tr>
				<th style="padding: 5px" align="left">Name</th>
				<th><input type="text" name="uname" /></th>
			</tr>
			<tr>
				<th style="padding: 5px" align="left">Password</th>
				<th><input type="password" name="upwd" /></th>
			</tr>
			<tr>
				<th style="padding: 5px" align="left"><input type="submit"
					value="Login"></tH>
			</tr>
		</table>
	</form>
</body>
</html>