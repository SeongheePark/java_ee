<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 세션을 꺼내는 방법 확인
String username = (String) session.getAttribute("username");
if (username == null) {
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {
		display: flex;
		justify-content: center;
		align-items: center;
		flex-direction: column;
		background-color: #33A135;
	}
	div {
		color: #ccc;
		margin: 20px;
		padding: 20px;
	}
	form {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		border-radius: none;
	}
	input[type="submit"] {
		font-size: 20px;
		
	}
	input[type="submit"]:hover {
		background-color: #E5DE5C;
	}
</style>
</head>
<body>
	<div>
	<h1>Welcome, <%=username %>!</h1>
	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>
	</div>
</body>
</html>