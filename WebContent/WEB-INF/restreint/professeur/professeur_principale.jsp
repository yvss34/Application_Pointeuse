<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Professeur</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
         <p>Bonjour ${ nom } ${ prenom }</p> <a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/Deconnexion">Deconnexion</a>
		
		<h1>Vos cours</h1>
		<c:forEach items="${ cours }" var="coursIterateur" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ coursIterateur }" /> !</p>
		</c:forEach>
		
		<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationCours">Ajouter un nouveau cours</a>
    </body>
</html>