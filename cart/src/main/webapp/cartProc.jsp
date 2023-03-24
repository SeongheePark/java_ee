<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String[] cart = request.getParameterValues("cart");
String[] names = {"coffee","juice","milk","beer","water"};
if (cart != null && cart.length > 0) {
	for(int i = 0; i < cart.length; i++) {
		Cookie cookie = new Cookie(names[i+1],"on");
		cookie.setMaxAge(60);
		response.addCookie(cookie);
	}
}
%>