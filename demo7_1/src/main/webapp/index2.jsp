<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setCharacterEncoding("UTF-8");
		String message = (String)request.getAttribute("msg2");
		out.println(message);
	%>
	<p>index2 파일 include 해보기</p>
</body>
</html>