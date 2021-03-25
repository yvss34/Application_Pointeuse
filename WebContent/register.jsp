<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- Head Begin -->
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Soutien Scolaire | Inscription</title>

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
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
      <b>Soutien</b>Scolaire
  </div>
  <!-- /.register-logo -->
  
  <div class="card">
	  <div class="card-body register-card-body">
	  	<p class="login-box-msg">Inscription</p>
	  	
	  	<form action="../../index.html" method="post">
	        <div class="input-group mb-3">
	          <input type="text" class="form-control" placeholder="Nom">
	          <div class="input-group-append">
	            <div class="input-group-text">
	              <span class="fas fa-user"></span>
	            </div>
	          </div>
	        </div>
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
	        <div class="input-group mb-3">
	          <input type="password" class="form-control" placeholder="Retaper le mot de passe">
	          <div class="input-group-append">
	            <div class="input-group-text">
	              <span class="fas fa-lock"></span>
	            </div>
	          </div>
	        </div>
	        <div class="input-group mb-3">
	          <input type="password" class="form-control" placeholder="Établissement">
	          <div class="input-group-append">
	            <div class="input-group-text">
	              <ion-icon name="school"></ion-icon>
	            </div>
	          </div>
	        </div>
	        
	        <div class="form-group">
			  <select class="form-control">
			    <option>Dirigeant</option>
			    <option>Professeur</option>
			    <option>Eleve</option>
			  </select>
			</div>
		  	
		  	<div class="row">
	          <div class="col-7">
	            <div class="icheck-primary">
	              <input type="checkbox" id="agreeTerms" name="terms" value="agree">
	              <label for="agreeTerms">
	               Acceptez <a href="./terms.jsp">termes</a>
	              </label>
	            </div>
	          </div>
	          <div class="col-5 text-right">
	          	<a href="./login.jsp">Avez compte?</a>
	          </div>
	        </div>
	        
		</form>
		
		<div class="inscription text-center mb-3" >
			<div>
			    <p class="login-box-msg"></p>
			</div>
			<button type="button" class="btn btn-block btn-success">S'inscrire</button>
		</div>
		<!-- /.register-inscription -->
      
	  </div>
	  <!-- /.register-card-body -->
  </div>
  <!-- /.register-card -->
</div>
<!-- /.register-box -->

<!-- jQuery -->
<script src="./assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="./assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Model -->
<script src="./assets/js/adminlte.min.js"></script>
<!-- Model for demo purposes -->
<script src="./assets/js/demo.js"></script>
<!-- Icons -->
<script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
</body>
<!-- Body End -->

</html>