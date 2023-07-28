<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>

<body>

<div class="container p-2">

		<h1 class="container mx-auto m-3 p-3 text-center">Ninja Gold</h1>

		<h2 class="mb-4">Your Gold: <span class=" border border-black" > <c:out value="${gold }"></c:out></span></h2>

		<div class="row text-center">
			<div class="card col mx-2">
				<form action="/gold" method="post">
					<h3>Farm</h3>
					<p>(earns 10-20 gold)</p>
					<input type="hidden" name="lugar" value="farm" />
					<button type="submit" class="btn btn-warning">GOLD!</button>
				</form>
			</div>


			<div class="card col mx-2">
				<form action="/gold" method="post">
					<h3>Cave</h3>
					<p>(earns 5-10 gold)</p>
					<input type="hidden" name="lugar" value="cave" />
					<button type="submit" class="btn btn-warning">GOLD!</button>
				</form>


			</div>

			<div class="card col mx-2">
				<form action="/gold" method="post">
					<h3>House</h3>
					<p>(earns 2-5 gold)</p>
					<input type="hidden" name="lugar" value="house" />
					<button type="submit" class="btn btn-warning">GOLD!</button>
				</form>

			</div>

			<div class="card col mx-2 p-1">
				<form action="/gold" method="post">
					<h3>Casino</h3>
					<p>(earns 0-50 gold)</p>
					<input type="hidden" name="lugar" value="casino" />
					<button type="submit" class="btn btn-warning">GOLD!</button>
				</form>

			</div>
		</div>

		<div>
			<h2 class="my-4">Activities</h2>

			<c:forEach items="${resultados }" var="resultado">
				<c:if test="${resultado.contains('aumentas') }">
					<p class="text-success"><c:out value="${resultado }"></c:out></p>
				</c:if>

				<c:if test="${resultado.contains('pierdes') }">
					<p class="text-danger"><c:out value="${resultado }"></c:out></p>
				</c:if>
			</c:forEach>

			<a class="btn btn-danger" href="/reset" role="button">RESET</a>
		</div>

	</div>


</body>
</html>