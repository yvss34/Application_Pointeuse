<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Emargement</title>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <form method="post" action="CreationEmargement">
            <fieldset>
                
                <select class="form-select" id="selectionCours" name="selectionCours">
				<c:forEach items="${ cours }" var="coursIterateur" varStatus="status">
			        
					  <option value="${ coursIterateur }">"${ coursIterateur }"</option>
					
				</c:forEach>
				</select>
				<span class="erreur">${form.erreurs['validation']}</span>
                <input type="submit" value="Emargement" class="sansLabel" />
                <br />
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
        
     
        
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Eleve">Retourner au menu principal</a>
    </body>
</html>