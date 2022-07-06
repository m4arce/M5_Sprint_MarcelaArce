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

<!-- Navbar implementado solo para la vista principal, sin acceso al resto de la app. -->
<!-- Incluye logIn/signIn que lleva la vista de login para ingresar a la app -->
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
					</ul>
					<form action="LoginServlet" class="d-flex">
						<button class="btn btn-outline-success" type="submit">Log
							In</button>
						|||
						<button class="btn btn-outline-success" type="submit">Sign
							In</button>
					</form>
				</div>
			</div>
		</nav>
	</div>
</header>

<br>
<br>

<body>
	<div class="position-relative">
		<h1 class="text-center">CAPACITACION EN PREVENCION DE RIESGOS</h1>
	</div>

	<br>
	<br>
	<br>
	<br>
	
	<!-- Aplicacion de Cards para mostrar la informacion de presentacion de la empresa -->

	<div class="row row-cols-1 row-cols-md-3 g-4">
		<div class="col">
			<div class="card h-100">
				<img
					src="https://img.freepik.com/foto-gratis/constructor-masculino-uniforme-jeans-guantes-casco-mano-vista-frontal_176474-10062.jpg"
					class="card-img-top" alt="prevencion2">
				<div class="card-body">
					<h5 class="card-title">QUE HACEMOS</h5>
					<p class="card-text">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Mauris eget velit et ipsum vestibulum condimentum
						quis eget elit. Morbi vulputate pulvinar semper. In ullamcorper
						diam at malesuada viverra. Morbi euismod pellentesque mauris, non
						euismod lorem. Proin ut consectetur arcu, ac vulputate mauris.
						Phasellus ante magna, aliquam nec maximus ut, blandit vel libero.
						Aenean egestas nisi ac vestibulum viverra. Ut gravida hendrerit
						pulvinar. Phasellus vel ex est. Pellentesque habitant morbi
						tristique senectus et netus et malesuada fames ac turpis egestas.
						Nam a pulvinar ante. Sed interdum dui vitae mattis pellentesque.
						Duis finibus metus purus, quis pharetra sem rhoncus in. Duis vel
						tincidunt elit, nec dictum nulla.</p>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card h-100">
				<img
					src="https://img.freepik.com/foto-gratis/retrato-trabajador-fabrica-equipo-proteccion-sosteniendo-thumbs-up-sala-produccion_342744-147.jpg"
					class="card-img-top" alt="prevencion3">
				<div class="card-body">
					<h5 class="card-title">QUIENES SOMOS</h5>
					<p class="card-text">Aliquam faucibus blandit nulla nec
						tristique. Sed in imperdiet ipsum, id maximus lectus. Integer non
						arcu vitae mi malesuada feugiat. Nam erat purus, porttitor id
						molestie ut, laoreet et ante. Aliquam ut sem eleifend metus
						rhoncus laoreet. Integer eget quam aliquet, tempus nisi et,
						egestas lorem. Nunc vestibulum tortor non nulla vehicula pulvinar.
						Curabitur maximus rutrum magna, id rutrum tortor porta ac. Ut quis
						venenatis velit. Quisque libero nulla, faucibus varius volutpat
						ac, malesuada sed neque.</p>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card h-100">
				<img
					src="https://img.freepik.com/foto-gratis/casco-construccion-seguridad-vista-superior-mascara-medica_23-2148784096.jpg"
					class="card-img-top" alt="prevencion1">
				<div class="card-body">
					<h5 class="card-title">COMO TRABAJAMOS</h5>
					<p class="card-text">Proin ut nisl euismod, ullamcorper tortor
						ac, posuere turpis. Pellentesque vestibulum, risus vitae imperdiet
						venenatis, sem ligula facilisis diam, et consectetur lorem diam ac
						turpis. Vestibulum ultricies felis non eleifend pulvinar. Nullam
						elit ex, ornare nec magna sit amet, dictum malesuada risus.
						Suspendisse non sagittis massa. Vivamus viverra mattis ante a
						porttitor. Donec sed mi elementum, consectetur sapien eu, volutpat
						purus.</p>
				</div>
			</div>
		</div>
	</div>


	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- Footer -->
	<!-- Script de Boostrap -->
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