<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todoList 정보 수정하기</title>
</head>
<body>
	<h1> todoList update form</h1>
	<form action="/todo2/todoTest?action=update" method="post">
		<input type = "number" name="id" required="required">
		<input type = "text" name="title" required="required">
		<input type = "submit" valud="정보 수정">
	</form>
</body>
</html>