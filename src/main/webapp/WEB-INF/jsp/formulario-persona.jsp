<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Persona</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class ="container">
		<div class="row">
			<div class="col-md-12">
				<h1>Formulario de Persona</h1>
				<form action="#" method="post">
			     	<div class="mb-3">
				    <label for="rut" class="form-label">Rut</label>
				    <input type="text" name="rut" class="form-control" id="rut">
				  </div>
				  <div class="mb-3">
				    <label for="nombre" class="form-label">Nombre</label>
				    <input type="text" name="nombre" class="form-control" id="nombre">
				  </div>
				  <div class="mb-3">
				    <label for="apellido" class="form-label">Apellido</label>
				    <input type="text" name="apellido" class="form-control" id="apellido">
				  </div>
				  <div class="mb-3">
				    <label for="email" class="form-label">Email</label>
				    <input type="email" name="email" class="form-control" id="email">
				  </div>
				  <button type="submit" class="btn btn-primary">Ingresar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>