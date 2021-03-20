<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Professeur</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="./assets/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-color: #f9f9fa
}

.padding {
	padding: 3rem !important
}

.user-card-full {
	overflow: hidden
}

.card {
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 20px 0 rgba(69, 90, 100, 0.08);
	box-shadow: 0 1px 20px 0 rgba(69, 90, 100, 0.08);
	border: none;
	margin-bottom: 30px
}

.m-r-0 {
	margin-right: 0px
}

.m-l-0 {
	margin-left: 0px
}

.user-card-full .user-profile {
	border-radius: 5px 0 0 5px
}

.bg-c-lite-green {
	background: -webkit-gradient(linear, left top, right top, from(#f29263),
		to(#ee5a6f));
	background: linear-gradient(to right, #ee5a6f, #f29263)
}

.user-profile {
	padding: 20px 0
}

.card-block {
	padding: 1.25rem
}

.m-b-25 {
	margin-bottom: 25px
}

.img-radius {
	border-radius: 5px
}

h6 {
	font-size: 14px
}

.card .card-block p {
	line-height: 25px
}

@media only screen and (min-width: 1400px) {
	p {
		font-size: 14px
	}
}

.card-block {
	padding: 1.25rem
}

.b-b-default {
	border-bottom: 1px solid #e0e0e0
}

.m-b-20 {
	margin-bottom: 20px
}

.p-b-5 {
	padding-bottom: 5px !important
}

.card .card-block p {
	line-height: 25px
}

.m-b-10 {
	margin-bottom: 10px
}

.text-muted {
	color: #919aa3 !important
}

.b-b-default {
	border-bottom: 1px solid #e0e0e0
}

.f-w-600 {
	font-weight: 600
}

.m-b-20 {
	margin-bottom: 20px
}

.m-t-40 {
	margin-top: 20px
}

.p-b-5 {
	padding-bottom: 5px !important
}

.m-b-10 {
	margin-bottom: 10px
}

.m-t-40 {
	margin-top: 20px
}

.user-card-full .social-link li {
	display: inline-block
}

.user-card-full .social-link li a {
	font-size: 20px;
	margin: 0 10px 0 0;
	-webkit-transition: all 0.3s ease-in-out;
	transition: all 0.3s ease-in-out
}
</style>
</head>
<body>

	<div class="page-content page-container" id="page-content">
    <div class="padding">
        <div class="row container d-flex justify-content-center">
            <div class="col-xl-6 col-md-12">
                <div class="card user-card-full">
                    <div class="row m-l-0 m-r-0">
                        <div class="col-sm-4 bg-c-lite-green user-profile">
                            <div class="card-block text-center text-white">
                                <div class="m-b-25"> <img src="https://img.icons8.com/bubbles/100/000000/user.png" class="img-radius" alt="User-Profile-Image"> </div>
                                <h6 class="f-w-600">${ nom } ${ prenom }</h6>
                                <p>Professeur</p> <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="card-block">
                                <h6 class="m-b-20 p-b-5 b-b-default f-w-600">Bonjour ${ prenom }</h6>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <h6 class="text-muted f-w-400"><a class="btn btn-primary btn-lg btn-block" href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationCours" role="button">Ajouter un cours</a></h6>
                                    </div>
                                    <div class="col-sm-6">
<h6 class="text-muted f-w-400"><a class="btn btn-primary btn-lg btn-block" href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Deconnexion" role="button">Deconnexion</a></h6>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
						<div class="col-sm-7">

						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Matiere</th>
							<th>Date</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ cours }" var="coursIterateur" varStatus="status">

							<tr>
								<td><c:out value="${ coursIterateur.identifiant }" /></td>
								<td><c:out value="${ coursIterateur.nom }" /></td>
								<td><c:out value="${ coursIterateur.horaires }" /></td>
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