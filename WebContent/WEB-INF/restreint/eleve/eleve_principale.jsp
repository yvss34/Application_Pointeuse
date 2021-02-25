<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Eleve</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
        <p>Bonjour ${ nom } ${ prenom }</p> <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Deconnexion">Deconnexion</a>
		
		<h1>Vos emargements</h1>
		<c:forEach items="${ emargements }" var="emargement" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ emargement }" /> !</p>
		</c:forEach>
		
		<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationEmargement">Emarger</a>
    </body>
</html>