<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
<div class="content">
	<form action="${pageContext.request.contextPath}/login" method="post">
		<div>
			<label for="username">Username:</label>
			<input type="text" id="username" name="username">
		</div>
		<div>
			<label for="pass">Password (8 characters minimum):</label>
			<input type="password" id="pass" name="password" required>
		</div>
		<input type="submit" value="Sign in">
	</form>
</div>
</body>
</html>