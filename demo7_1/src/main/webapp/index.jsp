<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2> 여기는 index 파일</h2>
		<div>
			<%
				String message = (String)request.getAttribute("msg");
				out.println(message);
			%>
		</div>
</body>
</html>