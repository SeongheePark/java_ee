<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="loginProc.jsp" method="post">
		<label for="username">name: </label>
		<input type="text" name="username" required="required">
		<label for="password">password: </label>
		<input type="password" name="password" required="required">
		<input type="submit" value="login">
	</form>
</body>
</html>