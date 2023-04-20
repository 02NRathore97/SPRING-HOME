<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FormData</title>
</head>
<body>
	<%-- <h1>Email = ${email}</h1>
	<h1>Username = ${username}</h1>
	<h1>Password = ${password}</h1> --%>
	
	<h1>Email = ${user.email}</h1>
	<h1>Username = ${user.username}</h1>
	<h1>Password = ${user.password}</h1>
	
	<h1>${Header }</h1>
	<h1>${Footer }</h1>
</body>
</html>