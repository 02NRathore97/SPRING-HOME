<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" />
	
		
 <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>/">
 <script src="<c:url value="/resources/js/script.js"/>" type="text/javascript"></script>


<title>Hello, world!</title>
</head>
<body>


 <img alt="img" src="<c:url value="/resources/img/Raysicon.png"/>"> 


	<div class="container" style="margin-top: 100px; ">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" >
				<div class="card" style="box-shadow: 5px 5px #888888 ;" id="color">
					<div class="card-body">
						<form action="search">
					<div class="form-group">
						<input type="text" class="form-control" name="querybox" placeholder="Enter your keyword here"> 
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-success">Search</button>
					</div>
				</form>
					</div>
				</div>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>

	
</body>
</html>