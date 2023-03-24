<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MySQL 연결</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap')
	;

body {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Noto Sans KR', sans-serif;
}

h1 {
	font-size: 40px;
	text-align: center;
}

nav {
	width: 500px;
	border: 1px solid gray;
	border-radius: 30px;
	margin: 20px;
	padding: 40px;
}

.button {
	display: flex;
	justify-content: center;
	align-items: center;
	text-decoration: none;
	
}
ul {
	display: flex;
	list-style: none;
	justify-content: center;
	align-items: center;
}

ul li {
	padding: 5px;
	margin: 10px;
	border: 1px solid pink;
	border-radius: 10px;
	font-size: 15px;
	color: black;
	background-color: pink;
	flex: 1;
	height: 40px;
	width: 80px;
	text-align: center;
	display: flex;
	justify-content: center;
	align-items: center;
}

ul li a {
	text-decoration: none;
	color: white;
}

a:linked {
	color: white;
}

a:visited {
	color: white;
}

a:hover {
	
}
</style>
</head>
<body>
	<nav>
		<h1>L o g i n</h1>
		<form action="/demo2/login.jsp" method="post">
			<div class="form-group">
				<label for="name"> name : </label> <input type="text"
					class="form-control" placeholder="Enter name" id="name" name="name">
			</div>
			<div class="form-group">
				<label for="password"> Password : </label> <input type="password"
					class="form-control" placeholder="Enter password" id="password"
					name="password">
			</div>
			<input type="submit" class="btn btn-outline-secondary" value="Login">
			
		</form>
		<ul class="nav nav-pills">
			<li class="nav-item"><a class="nav-link" href="/demo2/save.jsp">회원가입</a></li>
			<li class="nav-item"><a class="nav-link" href="/demo2/select.jsp">회원조회</a></li>
			<li class="nav-item"><a class="nav-link" href="/demo2/update.jsp">회원수정</a></li>
			<li class="nav-item"><a class="nav-link" href="/demo2/delete.jsp">회원탈퇴</a></li>
		</ul>
	</nav>
</body>
</html>
<jsp:include page="/layout/footer.jsp"></jsp:include>