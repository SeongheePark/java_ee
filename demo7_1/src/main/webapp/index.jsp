<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> result 값 보기</h1>
	<%
		response.setCharacterEncoding("UTF-8");
		String message = (String)request.getAttribute("message");
		out.println(message);
	%>
</body>
</html>