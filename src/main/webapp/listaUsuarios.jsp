<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="cl.jee.abpro.model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

	<div class="row row-cols-1 row-cols-md-1">
		<div class="col">
			<div class="card h-100 mx-auto" style="width: 800px;">
				<div class="card-body ">
					<div class="position-relative">
						<h1 class="text-center">LISTA USUARIOS</h1>
					</div>
					
					<!-- Tabla que contiene datos para efectos de lista usando jstl -->
					<table class="table">
						<thead class="table-secondary">
							<tr>
								<th>Nombre Usuario</th>
								<th>Contraseña</th>
								<th>Tipo</th>
								<th>Accion</th>

							</tr>
						</thead>

						<tbody> 

							<c:forEach var="u" items="${user}">

								<tr>
									<td><c:out value="${u.getUsuario()}"></c:out></td>
									<td><c:out value="${u.getPassword()}"></c:out></td>
									<td><c:out value="${u.getTipo()}"></c:out></td>
									<td><a href="${pageContext.request.contextPath}/UpdateUsuarioServlet?idusuarios=${u.getIdusuarios()}" class="btn btn-primary" role="button">editar</a></td>								
									
								</tr>	
								

							</c:forEach>

						</tbody>

					</table>

				</div>
			</div>
		</div>
	</div>




	<br>
	<br>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- Footer -->
	
	<!-- Script de bootstrap -->
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