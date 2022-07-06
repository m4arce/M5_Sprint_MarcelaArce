<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<h1 class="text-center">CONTACTO</h1>
	</div>
	
	<!--  Mensaje desplegado para indicar que el contacto se ha creado y enviado exitosamente -->
	<!--  Se dispone de esta vista para ejecutar la accion de despliegue desde un Servlet para efectos de aprendizaje -->

	<div class="position-relative">
		<h2 class="text-center">***SUS DATOS SE HAN ENVIADO EXITOSAMENTE, PRONTO NOS CONTACTAREMOS CON USTED***</h2>
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