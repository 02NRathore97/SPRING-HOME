<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">

<title>Form</title>
</head>
<body>
<div class="container" style="margin-top: 100px">
	<div class="row">
		<div class="col-md-4"></div>
<div class="col-md-4 card" style="box-shadow: 5px 5px #888888;">
	<div class="card-body">
	
	<h3 class="text-center">Registration form</h3>
	
		<form action="processform" method="post">
		
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input type="email"  name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"> 
			<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="exampleInputUsername">User name</label> 
			<input type="text" name="username" class="form-control" id="exampleInputUsername"  placeholder="Enter Username"> 
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
		</div>
		
		<div class="text-center">
			<button type="submit" class="btn btn-success ">SignUp</button>
		</div>
	</form>
	</div>
</div>
<div class="col-md-4"></div>
		
	</div>
</div>
	



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>