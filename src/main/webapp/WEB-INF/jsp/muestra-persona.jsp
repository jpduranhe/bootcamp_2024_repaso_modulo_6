<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persona</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<div class ="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card" style="width: 18rem;">
				  <div class="card-header">
				    Datos Persona <small>${per.rut}</small>
				  </div>
				  <ul class="list-group list-group-flush">
				    <li class="list-group-item">${per.nombre}</li>
				    <li class="list-group-item">${per.apellido}</li>
				    <li class="list-group-item">${per.email}</li>
				  </ul>
				</div>
			</div>
		</div>
	</div>	


</body>
</html>