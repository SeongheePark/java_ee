<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	box-sizing: border-box;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
}
body{
	display: flex;
	justify-content: center;
}

section {
	width: 1300px;
	margin: 40px 20px;
	padding: 20px;
	background-color: #fff;
	display: flex;
	justify-content: center;
}

article.main {
	flex: 3;
	order: 2;
	justify-content: center;
	display: flex;
	flex-direction: column;
}

article.side1 {
	flex: 1;
	order: 1;
}

article.side2 {
	flex: 1;
	order: 3;
	text-align: right;
}

article.main.img {
	flex: 1;
}
</style>
</head>
<body>
	<section>
		<article class="main">
			<img alt="메인이미지" src="images/image.jpg">
			<h2>main Content</h2>
			<p>Lorem ipsum, or lipsum as it is sometimes known, is dummy text
				used in laying out print, graphic or web designs. The passage is</p>
		</article>
		<article class="side1">
			<h2>Side Content 1</h2>
			Lorem ipsum, or lipsum as it is sometimes known, is dummy text used
			in laying out print, graphic or web designs. The passage is
			attributed to an unknown typesetter in the 15th century who is
			thought to have scrambled parts of Cicero's De Finibus Bonorum et
			Malorum for use in a type specimen book. It usually begins with:
		</article>
		<article class="side2">
			<h2>Side Content 2</h2>
			Lorem ipsum, or lipsum as it is sometimes known, is dummy text used
			in laying out print, graphic or web designs. The passage is
			attributed to an unknown typesetter in the 15th century who is
			thought to have scrambled parts of Cicero's De Finibus Bonorum et
			Malorum for use in a type specimen book. It usually begins with:
		</article>
	</section>
</body>
</html>