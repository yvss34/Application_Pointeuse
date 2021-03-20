<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>	Creation cours</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
       
        <div class="container register-form">
            <form method="post" action="CreationProfesseur">
                <div class="note">
                    <p>Ajouter un cours</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Nom *" id="nom" name="nom" value="" size="20" maxlength="60" />
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Annee *" id="annee" name="annee" value="" size="20" maxlength="20" />
                            </div>
                            
                            <div class="form-group">
                         		<input type="text" class="form-control" placeholder="Mois *" id="mois" name="mois" value="" size="20" maxlength="20" />               
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                            	<input type="text" id="jour" class="form-control" placeholder="Jour *" name="jour" value="" size="20" maxlength="20" />
                                                                 </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Heure *" id="heure" name="heure" value="" size="20" maxlength="20" />                                              
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Minute *" id="minute" name="minute" value="" size="20" maxlength="20" />
                  			</div>
                        </div>
                    </div>
                    <input type="submit" value="Ajout" class="sansLabel" />
                    
                    <p class="${empty form.erreurs ? 'succes' : 'erreur'}" style="color:red">${form.resultat}</p>
                </div>
            </form>
        </div>
        
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Professeur">Retourner au menu principal</a>
    </body>
</html>