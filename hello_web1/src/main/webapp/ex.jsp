<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

header {
	background-color: gray;
	color: white;
	text-align: center;
	padding: 40px;
}

section {
	display: flex;
	margin: 0;
	padding: 20px;
}

.left {
	background-color: beige;
	padding: 10px;
	flex: 1;
}

.right {
	background-color: pink;
	flex: 3;
}

.left ul {
	
}
</style>
</head>
<body>
	<header>
		<h2>First JSP Web</h2>
	</header>
	<section>
		<div class="left">
			<ul>
				<li>홈</li>
				<li>구독화면</li>
				<li>추천화면</li>
			</ul>
		</div>
		<div class="right">Lorem ipsum, or lipsum as it is sometimes
			known, is dummy text used in laying out print, graphic or web
			designs. The passage is attributed to an unknown typesetter in the
			15th century who is thought to have scrambled parts of Cicero's De
			Finibus Bonorum et Malorum for use in a type specimen book. It
			usually begins with:</div>
	</section>
	<footer>footer</footer>
</body>
</html>