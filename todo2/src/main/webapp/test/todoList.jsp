<%@page import="com.tenco.todo.repository.CategoryDAO"%>
<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Todo List</h2>
	<table>
		<tr>
			<td>Id</td>
			<td>Title</td>
			<td>Description</td>
			<td>Priority</td>
			<td>Completed</td>
			<td>CategoryId</td>
			<td>CreateAt</td>
		</tr>
		<c:forEach var="todoList" items="${list}">
		<tr>
			<td>${todoList.id}</td>
			<td>${todoList.title}</td>
			<td>${todoList.description}</td>
			<td>${todoList.priority}</td>
			<td>${todoList.completed}</td>
			<td>${todoList.categoryId}</td>
			<td>${todoList.createAt}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>