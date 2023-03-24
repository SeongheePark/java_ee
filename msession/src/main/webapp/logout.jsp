<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate(); //session 메모리에서 해제. 로그아웃처리
	response.sendRedirect("login.jsp"); //로그아웃 이후 페이지 이동
%>