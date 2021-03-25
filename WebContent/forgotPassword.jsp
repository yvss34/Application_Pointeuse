<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- Head Begin -->
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Soutien Scolaire | Mot de passe perdu</title>

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
	  	<p class="login-box-msg">Vous avez oubli� votre mot de passe? Ici, vous pouvez facilement r�cup�rer un nouveau mot de passe.</p>
	  	
		<form action="recoverPassword.html" method="post">
		     <div class="input-group mb-3">
		       <input type="email" class="form-control" placeholder="Email">
		       <div class="input-group-append">
		         <div class="input-group-text">
		           <span class="fas fa-envelope"></span>
		         </div>
		       </div>
		     </div>
		     <div class="row">
		       <div class="col-12">
		         <button type="button" class="btn btn-block btn-success">Demander un nouveau mdp!</button>
		       </div>
		       <!-- /.col -->
		     </div>
		</form>
		   
		<div class="row">
			<div class="col-6">
			  <a href="./register.jsp">Inscription</a>
			</div>
			<div class="col-6 text-right">
				<a href="./login.jsp">Connexion</a>
			</div>
		</div>
      
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