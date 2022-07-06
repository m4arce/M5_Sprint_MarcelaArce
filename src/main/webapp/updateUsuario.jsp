<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="es">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>EmpresaPrevencionriesgos</title>
</head>

<!-- Navbar que contiene menu compartido con las vistas dentro de la app -->
<header>
<%@ include file="navbar.jsp"%>
</header>

<br>
<br>

<body>
	<div class="position-relative">
		<h1 class="text-center">ACTUALIZAR USUARIO</h1>
	</div>
	<br>
	<br>

	<!-- Card que contiene form de actualizacion, el que debe traer la informacion desde la base de datos para realizar el update -->
	<div class="row row-cols-1 row-cols-md-1">
		<div class="col">
			<div class="card h-100 bg-secondary mx-auto" style="width: 400px;">
				<div class="card-body ">
					<h5 class="card-title text-center">ACTUALIZAR USUARIO</h5>
					<form action="UpdateUsuarioServlet" method="post">
					
						<div class="row mb-3">									

							<div class="col-sm-10 mx-auto">
								<input type="hidden" readonly="readonly" class="form-control" name="idusuarios" value="${useri.getIdusuarios()}" >
							</div>
						</div>					
						
						<div class="row mb-3">								

							<div class="col-sm-10 mx-auto">
								<input type="text" class="form-control" name="usuario" value="${useri.getUsuario()}" required>
							</div>
						</div>
						<div class="row mb-3">

							<div class="col-sm-10 mx-auto">
								<input type="password" class="form-control" name="password" value="${useri.getPassword()}" required>									
							</div>
						</div>

						<div class="row mb-3">

							<div class="col-sm-10 mx-auto">

								<select class="form-select" name="tipo" aria-label="Default select example" required>
								
								
									<option selected>Elige un tipo de usuario</option>
									<option value="cliente">Cliente</option>
									<option value="administrativo">Administrativo</option>
									<option value="profesional">Profesional</option>
								</select>

							</div>
						</div>

						<div class="col-sm-10 mx-auto text-center">
							<button type="submit" class="btn btn-primary col-sm-5">Actualizar</button>
							<button type="reset" class="btn btn-primary col-sm-5">Cancelar</button>
						</div>
						
					</form>
					
				</div>
			</div>
		</div>
	</div>

	<br>
	<br>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- Footer -->
	
	<!-- Script de Bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>