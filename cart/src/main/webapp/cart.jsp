<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap');
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Noto Sans KR', sans-serif;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}

form {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}
label {
	margin-top: 20px;
	padding-top: 20px;
}
div {
	margin-bottom: 10px;
	padding-bottom: 10px;
}
input {
	margin: 10px;
}
</style>
</head>
<body>
	<h1>Shopping List</h1>
	<form action="cartProc.jsp">
		<label> 원하는 목록을 장바구니에 담아주세요! </label>
		<div>
			<input type="checkbox" name="cart"> coffee 
			<input type="checkbox" name="cart"> juice 
			<input type="checkbox" name="cart"> milk 
			<input type="checkbox" name="cart"> beer 
			<input type="checkbox" name="cart"> water
		</div>
		<input type="submit" name="check"  class="btn btn-success" value="장바구니 담기">
		<input type="submit" name="delete"  class="btn btn-success" value="삭제 하기">
	</form>
</body>
</html>