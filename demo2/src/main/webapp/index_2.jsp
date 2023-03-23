<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
form {
	border: 1px solid black;
	margin: 20px;
	padding: 20px;
	border-radius: 10px;
}
.buttons {
	padding: 20px;
}
</style>
</head>
<body>
	<form action="/demo2/sv" method="post">
	<div>
	<h2> 회 원 가 입</h2>
	<label for="name">name: </label>
	<input type="text" class="form-control" placeholder="Enter name" name="name">
	</div>
	<div>
	<label for="password">password : </label>
	<input type="text" class="form-control" placeholder="Enter password" name="password">
	</div>
	<div class="buttons">
	<button type="submit" class="btn btn-outline-success">저장</button>
	<button type="button" class="btn btn-outline-success">삭제</button>
	</div>
	</form>
</body>
</html>