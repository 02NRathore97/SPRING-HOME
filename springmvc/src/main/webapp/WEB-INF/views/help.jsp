<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>This is help page</h1>

<%
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	LocalDateTime time = (LocalDateTime)request.getAttribute("time");
%>


<h1>Name = <%= name%></h1>
<h1>Id = <%= id%></h1>
<h1>Date and Time = <%=time.toString() %> </h1>

<h1>name = ${name}</h1>

<h1>marks = ${marks}</h1>

<c:forEach var="item" items="${marks}">
	<h1>${item}</h1>
</c:forEach>


</body>
</html>