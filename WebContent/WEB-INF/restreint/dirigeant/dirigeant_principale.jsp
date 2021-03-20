<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap User Management Data Table</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
}

.table-responsive {
	margin: 30px 0;
}

.table-wrapper {
	min-width: 1000px;
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
	padding-bottom: 15px;
	background: #299be4;
	color: #fff;
	padding: 16px 30px;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}

.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}

.table-title .btn {
	color: #566787;
	float: right;
	font-size: 13px;
	background: #fff;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}

.table-title .btn:hover, .table-title .btn:focus {
	color: #566787;
	background: #f2f2f2;
}

.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}

.table-title .btn span {
	float: left;
	margin-top: 2px;
}

table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}

table.table tr th:first-child {
	width: 60px;
}

table.table tr th:last-child {
	width: 100px;
}

table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}

table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}

table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}

table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}

table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
}

table.table td a:hover {
	color: #2196F3;
}

table.table td a.settings {
	color: #2196F3;
}

table.table td a.delete {
	color: #F44336;
}

table.table td i {
	font-size: 19px;
}

table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}

.status {
	font-size: 30px;
	margin: 2px 2px 0 0;
	display: inline-block;
	vertical-align: middle;
	line-height: 10px;
}

.text-success {
	color: #10c469;
}

.text-info {
	color: #62c9e8;
}

.text-warning {
	color: #FFC107;
}

.text-danger {
	color: #ff5b5b;
}

.pagination {
	float: right;
	margin: 0 0 5px;
}

.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}

.pagination li a:hover {
	color: #666;
}

.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}

.pagination li.active a:hover {
	background: #0397d6;
}

.pagination li.disabled i {
	color: #ccc;
}

.pagination li i {
	font-size: 16px;
	padding-top: 6px
}

.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}
</style>
<script>
	$(document).ready(function() {
		$('[data-toggle="tooltip"]').tooltip();
	});
</script>

<nav class="navbar navbar-light bg-light justify-content-between">
	<a class="navbar-brand">Bonjour ${ nom } ${ prenom }</a> <a
		href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Deconnexion"
		><span>Deconnexion</span></a>
</nav>

</head>
<body>








	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-5">
							<h2>
								Liste <b>Dirigeants</b>
							</h2>
						</div>
						<div class="col-sm-7">
							<a
								href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationDirigeant"
								class="btn btn-secondary"><i class="material-icons">&#xE147;</i>
								<span>Ajouter un dirigeant</span></a>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Nom</th>
							<th>Email</th>
							<th>Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ dirigeants }" var="dirigeant"
							varStatus="status">

							<tr>
								<td><c:out value="${ dirigeant.identifiant }" /></td>
								<td><c:out value="${ dirigeant.nom }" /> <c:out
										value="${ dirigeant.prenom }" /></a></td>
								<td><c:out value="${ dirigeant.email }" /></td>
								<td><a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/SupprimerDirigeant?identifiant=${ dirigeant.identifiant }" class="delete" title="Delete"
									data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-5">
							<h2>
								Liste <b>Professeurs</b>
							</h2>
						</div>
						<div class="col-sm-7">
							<a
								href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationProfesseur"
								class="btn btn-secondary"><i class="material-icons">&#xE147;</i>
								<span>Ajouter un professeur</span></a>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Nom</th>
							<th>Email</th>
							<th>Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ professeurs }" var="professeur"
							varStatus="status">

							<tr>
								<td><c:out value="${ professeur.identifiant }" /></td>
								<td><c:out value="${ professeur.nom }" /> <c:out
										value="${ professeur.prenom }" /></a></td>
								<td><c:out value="${ professeur.email }" /></td>
								<td><a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/SupprimerProfesseur?identifiant=${ professeur.identifiant }" class="delete" title="Delete"
									data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
									<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/vueProfesseur?identifiant=${ professeur.identifiant }" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-5">
							<h2>
								Liste <b>Eleves</b>
							</h2>
						</div>
						<div class="col-sm-7">
							<a
								href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationEleve"
								class="btn btn-secondary"><i class="material-icons">&#xE147;</i>
								<span>Ajouter un eleve</span></a>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Nom</th>
							<th>Email</th>
							<th>Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ eleves }" var="eleve" varStatus="status">

							<tr>
								<td><c:out value="${ eleve.identifiant }" /></td>
								<td><c:out value="${ eleve.nom }" /> <c:out
										value="${ eleve.prenom }" /></a></td>
								<td><c:out value="${ eleve.email }" /></td>
								<td><a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/SupprimerEleve?identifiant=${ eleve.identifiant }" class="delete" title="Delete"
									data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
									
									<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/vueEleve?identifiant=${ eleve.identifiant }" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-5">
							<h2>
								Liste <b>Cours</b>
							</h2>
						</div>
						<div class="col-sm-7"></div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Professeur</th>
							<th>Matiere</th>
							<th>Heure</th>
							<th>Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ cours }" var="coursIterateur"
							varStatus="status">
							<tr>
								<td><c:out value="${ coursIterateur.identifiant }" /></td>
								<td><c:out
										value="${ coursIterateur.identifiantProfesseur }" /></td>
								<td><c:out value="${ coursIterateur.nom }" /></td>
								<td><c:out value="${ coursIterateur.horaires }" /></td>
								<td><a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/SupprimerCours?identifiant=${ coursIterateur.identifiant }" class="delete" title="Delete"
									data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
									<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/vueCours?identifiant=${ coursIterateur.identifiant }" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script src="./assets/js/bootstrap.bundle.min.js"
		integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    -->

</body>
</html>