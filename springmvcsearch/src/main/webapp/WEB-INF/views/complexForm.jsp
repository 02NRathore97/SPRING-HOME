<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div class="container" style="margin-top: 30px;">
		<div class="row">

			<div class="col-md-8 offset-2">

				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="form.*"/>
							
						</div>
						<form action="processForm" method="post">
							<div class="form-group">
								<label>Email address</label> <input type="email" name="email"
									class="form-control" placeholder="Enter email"> <small
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password" name="password"
									class="form-control" placeholder="Password">
							</div>
							<div class="form-check mt-2">
								<input type="checkbox" name="checkbox" class="form-check-input">
								<label class="form-check-label">Check me out</label>
							</div>
							<div class="form-group mt-2">
								<label>DOB</label> <input type="text" name="date"
									class="form-control" placeholder="dd/MM/yyyy">
							</div>
							<div class="mt-2">
								<label>Select Gender</label> <select class="form-control"
									name="gender">
									<option value="male">Male</option>
									<option value="female">Female</option>
								</select>
							</div>
							<div class="mt-2">
								<label>Select Subjects select</label> <select multiple
									class="form-control" name="select">
									<option value="java">Java</option>
									<option value="php">Php</option>
									<option value="pythan">Pythan</option>
									<option value="html">Html</option>
									<option value="c">C</option>
								</select>
							</div>
							<div class="form-group mt-2">
								<div class="card">
									<div class="card-body">
										<label>Street</label> <input type="text" name="address.street"
											class="form-control" placeholder="Street"> <label>City</label>
										<input type="text" name="address.city" class="form-control"
											placeholder="City">
									</div>
								</div>
							</div>
							<div class="mt-2">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>