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
        
		<h1>La liste des dirigeants</h1>
		<c:forEach items="${ dirigeants }" var="dirigeant" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ dirigeant }" /> !</p>
		</c:forEach>
		
		<h1>La liste des professeurs</h1>
		<c:forEach items="${ professeurs }" var="professeur" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ professeur }" /> !</p>
		</c:forEach>
		
		<h1>La liste des eleves</h1>
		<c:forEach items="${ eleves }" var="eleve" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ eleve }" /> !</p>
		</c:forEach>
		
		<h1>La liste des cours</h1>
		<c:forEach items="${ cours }" var="coursIterateur" varStatus="status">
    		<p>N°<c:out value="${ status.count }" /> : <c:out value="${ coursIterateur }" /> !</p>
		</c:forEach>
		
		<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationEleve">Ajouter un eleve</a>
		<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationProfesseur">Ajouter un professeur</a>
		<a href="http://localhost:8080/Projet_Libre_Application_Pointeuse/CreationDirigeant">Ajouter un dirigeant</a>
    </body>
</html>