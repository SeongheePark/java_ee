<%@page import="java.util.ArrayList"%>
<%@page import="com.tenco.dao.Dao"%>
<%@page import="com.tenco.dto.Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Dao dao = new Dao();
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");
    	ArrayList<Dto> user = dao.select();
    	for(int i=0; i < user.size(); i++) {
    		if(user.get(i).getName() == name && user.get(i).getPassword() == password) {
    			// 로그인 성공
    			
    		} else {
    			// 로그인 실패
    			
    		}
    	}
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>