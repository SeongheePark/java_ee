<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 여기 jsp 파일을 error 전용 페이지로 사용하려면 반드시 isErrorPage = true 선언 -->
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap');
*{
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
h3 {
	color: red;
	margin-bottom: 20px;
}
div {
	margin-bottom: 10px;
}
input {
	margin: 5px;
	background-color: white;
	border: 0.5px solid gray;
	cursor: pointer;
}
input :hover {
	background-color: red;
	color: white;
}
</style>
</head>
<body>
<%
		String imgDir = null;
		imgDir = application.getInitParameter("imgDir");

	%>
	<div>
		<img alt="배너이미지" src="/demo6<%=imgDir %>/error.png">
	</div>
	<h3>요청한 페이지를 찾을 수 없습니다</h3>
	<div>
		페이지가 존재하지 않거나, 사용할 수 없는 페이지입니다. <br> 
		입력하신 주소가 정확한지 다시 한번 확인해 주시기 바랍니다.
	</div>
	<input type="button" value="돌아가기" name="back">
</body>
</html>