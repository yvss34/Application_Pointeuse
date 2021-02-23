<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>

	<c:if test="${ !empty form.resultat }">
		<p>
			<c:out value="${ form.resultat }" />
		</p>
	</c:if>

	<form method="post" action="Login">
		<p>
			<label for="nom">Login : </label> <input type="text" name="login"
				id="login" />
		</p>
		<p>
			<label for="nom">Mot de passe : </label> <input type="password" name="pass"
				id="pass" />
		</p>
		<input type="submit" />
	</form>

</body>
</html>