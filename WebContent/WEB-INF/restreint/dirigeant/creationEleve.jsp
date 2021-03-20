<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Creation Eleve</title>
        <link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
	<div class="container register-form">
		<form method="post" action="CreationEleve">
			<div class="note">
				<p>Ajouter un eleve</p>
			</div>

			<div class="form-content">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Nom *"
								id="nom" name="nom" value="" size="20" maxlength="60" />
						</div>
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Prenom *"
								id="prenom" name="prenom" value="" size="20" maxlength="20" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<input type="text" id="email" class="form-control"
								placeholder="Email *" name="email" value="" size="20"
								maxlength="20" /> <span class="erreur" style="color:red">${form.erreurs['email']}</span>
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Mot de passe *" id="motdepasse" name="motdepasse"
								value="" size="20" maxlength="20" /> <span class="erreur" style="color:red">${form.erreurs['motdepasse']}</span>
						</div>
					</div>
				</div>
				<input type="submit" value="Ajout" class="sansLabel" />

				<p class="${empty form.erreurs ? 'succes' : 'erreur'}" style="color:red">${form.resultat}</p>
			</div>
		</form>
	</div>
        
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Dirigeant">Retourner au menu principal</a>
    </body>
</html>