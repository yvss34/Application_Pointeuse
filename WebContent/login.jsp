<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- Head Begin -->
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Soutien Scolaire | Connexion</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="./assets/plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="./assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="./assets/css/adminlte.min.css">
</head>
<!-- Head End -->

<!-- Body Begin -->
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <b>Soutien</b>Scolaire
  </div>
  <!-- /.login-logo -->
  
  <div class="card">
	  <div class="card-body login-card-body">
	  	<p class="login-box-msg">Connexion</p>
	  	
	  	<form action="../../index3.html" method="post">
	        <div class="input-group mb-3">
	          <input type="email" class="form-control" placeholder="Email">
	          <div class="input-group-append">
	            <div class="input-group-text">
	              <span class="fas fa-envelope"></span>
	            </div>
	          </div>
	        </div>
	        <div class="input-group mb-3">
	          <input type="password" class="form-control" placeholder="Mot de passe">
	          <div class="input-group-append">
	            <div class="input-group-text">
	              <span class="fas fa-lock"></span>
	            </div>
	          </div>
	        </div>
	        <div class="row">
	          <div class="col-8">
	            <a href="./forgotPassword.jsp">Mot de passe perdu?</a>
	          </div>
	          <div class="col-4 text-right">
	          	<a href="./register.jsp">Inscription</a>
	          </div>
	        </div>
      	</form>
      	
		<div class="connexion text-center mb-3" >
			<div>
			    <p class="login-box-msg"></p>
			</div>
			<button type="button" class="btn btn-block btn-success">Connexion</button>
		</div>
		<!-- /.login-connexion -->
      
	  </div>
	  <!-- /.login-card-body -->
	  	
	</div>
	<!-- /.login-card -->
      
</div>
<!-- /.login-box -->


<!-- jQuery -->
<script src="./assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="./assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Model -->
<script src="./assets/js/adminlte.min.js"></script>
</body>
<!-- Body End -->

</html>