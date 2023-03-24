<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 넘겨받은 값 username과 password를 확인해서 
	// admin1과 1234 값이 같다면 로그인 처리하는 코드를 작성하세요
	// 아이디와 비번이 맞지 않다면 login.jsp 페이지로 이동하는 코드 작성
	String userName = request.getParameter("username");
	String userPwd = request.getParameter("password");
	if(userName != null && userPwd != null) {
		if(userName.equals("admin1") && userPwd.equals("1234")) {
			session.setAttribute("username", userName);
			response.sendRedirect("index.jsp");
		} else {
			out.println("<script>alert('아이디와 비밀번호가 맞지 않습니다'); location.href='login.jsp'</script>");
		}
	}
%>