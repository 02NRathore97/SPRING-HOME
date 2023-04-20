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

<title>Upload Image</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-4" style="margin-top: 100px" >

				<h1>Upload Image</h1>
				<form action="uploadimage" method="post" enctype="multipart/form-data">
					<div class="form-group">
						<label >Select image</label> 
						<input type="file" class="form-control-file" name="profile" id="file1">
					</div>
					<div class="text-center">
						<button class="btn btn-success">Upload</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>