<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Creation Professeur</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
        <form method="post" action="CreationProfesseur">
            <fieldset>
                <legend>Creation professeur</legend>
                <p>Vous pouvez inscrire un professeur via ce formulaire.</p>

                <label for="nom">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="60" />
                <br />

                <label for="prenom">Prenom <span class="requis">*</span></label>
                <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
                <br />

				<label for="email">Email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="20" />
                <br />
                <span class="erreur">${form.erreurs['email']}</span>
                
                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="text" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['motdepasse']}</span>
                <br />
                
                <input type="submit" value="Ajout" class="sansLabel" />
                <br />
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Dirigeant">Retourner au menu principal</a>
    </body>
</html>