<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="/layout/header.jsp"></jsp:include>
<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: center;
	justify-content: flex-start;
}

main pre {
	width: 100%;
	border: 1px solid black;
	padding: 20px;
}
</style>
<main>
	<pre>
	<%

	%> 스크립트 릿
	<%=""%> 표현식
	<%-- 주석 --%> jsp 주석, 이건 확인 불가
	<!-- 주석 --> html 주석, 소스보기로 확인 가능
	
	-----------------------------------------
	scriptlet은 HTML과 Java 코드를 혼합하여 사용할 수 있습니다.
	<%
	new java.util.Date();
	%> <-- 출력은 안됨
	화면에 데이터를 출력하려면 표현식을 사용해야 한다.
	<%=new java.util.Date()%>
	-----------------------------------------
	
	사용방법
	scriptlet : <% %> JSP페이지에서 코드를 실행할 수 있습니다.
	expression : <%=""%> JSP페이지에서 Java 코드의 결과값을 출력할 수 있습니다.
	
	자바 코드 위치
	scriptlet : JSP 페이지 어디든지 위치 가능
	expression : HTML 태그 내부에서만 사용 가능
	
	출력결과
	scriptlet : 출력 결과를 지정하지 않으면 아무런 출력이 일어나지 않습니다.
	expression : Java 결과값을 출력
</pre>
</main>
<jsp:include page="/layout/footer.jsp"></jsp:include>