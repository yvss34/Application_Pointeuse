<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Emargement</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
        <form method="post" action="CreationEmargement">
            <fieldset>
                <legend>Emargement</legend>
                <p>Choisissez le cours</p>
                
                <select id="selectionCours" name="selectionCours">
				<c:forEach items="${ cours }" var="coursIterateur" varStatus="status">
			        
					  <option value="${ coursIterateur }">"${ coursIterateur }"</option>
					
				</c:forEach>
				</select>
				<span class="erreur">${form.erreurs['validation']}</span>
                <input type="submit" value="CreationEmargement" class="sansLabel" />
                <br />
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Eleve">Retourner au menu principal</a>
    </body>
</html>