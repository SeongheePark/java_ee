<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List 정보 저장하기</title>
<style type="text/css">
</style>
</head>
<body>
	<h2>Todo List Insert Form</h2>
	<form action="/todo/todoTest?action=insert" method="post">
		<label> 할일 </label> 
		<input type="text" name="title" required="required"> 
		<label> 메모 </label>
		<input type="text" name="description"> 
		<label> 우선순위 </label> 
		<input type="text" name="priority"> 
		<label> 완료여부 </label> 
		<input type="text" name="completed"> 
		<label> 카테고리 </label> 
		<input type="text" name="categoryId" required="required"> 
		<input type="submit" name ="todo입력" value="입력하기">
	</form>
</body>
</html>