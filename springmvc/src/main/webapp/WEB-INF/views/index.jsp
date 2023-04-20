<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is Index page</h1>
<h1>Called by home controller</h1>
<h1>url/home</h1>

<%
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends = (List<String>)request.getAttribute("f");
%>
<h1>Name = <%=name %></h1>
<h1>Id = <%=id %></h1>

<%for(String f : friends ){ %>
	<h1><%=f %></h1>
<% } %>

</body>
</html>