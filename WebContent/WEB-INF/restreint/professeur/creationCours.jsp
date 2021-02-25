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
        <form method="post" action="CreationCours">
            <fieldset>
                <legend>Creation cours</legend>
                <p>Vous pouvez creer un cours via ce formulaire.</p>

                <label for="nom">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="60" />
                <br />

                <label for="annee">Annee <span class="requis">*</span></label>
                <input type="text" id="annee" name="annee" value="" size="20" maxlength="20" />
                <br />

				<label for="mois">Mois <span class="requis">*</span></label>
                <input type="text" id="mois" name="mois" value="" size="20" maxlength="20" />
                <br />
                
                <label for="jour">Jour <span class="requis">*</span></label>
                <input type="text" id="jour" name="jour" value="" size="20" maxlength="20" />
                <br />
                
                <label for="heure">Heure <span class="requis">*</span></label>
                <input type="text" id="heure" name="heure" value="" size="20" maxlength="20" />
                <br />
                
                <label for="minute">Minute <span class="requis">*</span></label>
                <input type="text" id="minute" name="minute" value="" size="20" maxlength="20" />
                <br />
                
                <input type="submit" value="Ajout" class="sansLabel" />
                <br />
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
        
        <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Professeur">Retourner au menu principal</a>
    </body>
</html>