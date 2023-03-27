<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 오류가 발생하면 다른곳으로 이동시키기 -->
    <%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = null;
		out.print(str.split("/"));
	%>
</body>
</html>