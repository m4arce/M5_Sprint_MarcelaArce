<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Navbar que contiene menu compartido con las vistas dentro de la app. sera implementado via jstl -->

<header>

	<div class="">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Prevent-Data</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarScroll"
					aria-controls="navbarScroll" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarScroll">
					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
						style="-bs-scroll-height: 100px;">

						<li class="nav-item"><a class="nav-link"
							href="CapacitacionServlet">Crear Capacitacion</a></li>
						<li class="nav-item"><a class="nav-link"
							href="ListarCapacitacionesServlet">Lista Capacitaciones</a></li>
						<li class="nav-item"><a class="nav-link"
							href="CrearUsuarioServlet">Crear Usuario</a></li>
						<li class="nav-item"><a class="nav-link"
							href="ListadoUsuariosServlet">Lista Usuario</a></li>
						<li class="nav-item"><a class="nav-link"
							href="ContactoServlet">Contacto</a></li>

					</ul>
					<form action="LogoutServlet" class="d-flex">
						<button class="btn btn-outline-success" type="submit">Log
							Out</button>

					</form>
				</div>
			</div>
		</nav>
	</div>

</header>