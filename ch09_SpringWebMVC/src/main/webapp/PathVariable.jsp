<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>PathVariable 예제</h2>

	<h2>*.do 설정부분</h2>
	<a href="user/jang.do">요청1</a><br><br>
	<a href="user/hee.do">요청2</a><br><br>
	<a href="user/kim.do">요청3</a><br><br>
	<a href="cafe/kim.do">요청4</a>
	<br><hr><br>
	<h2>/blog/* 설정부분</h2>
	<a href="blog/jang">요청1</a><br><br>
	<a href="blog/hee">요청2</a><br><br>
	<a href="blog/kim">요청3</a><br><br>
	<br><hr><br>
	<h2>/blog/* 설정부분</h2>
	<a href="blog/borad/qna/1">요청1</a><br><br>
	<a href="blog/borad/faq/2">요청2</a><br><br>
	<a href="blog/borad/bbs/3">요청3</a><br><br>
	<a href="user/borad/bbs/3">요청4</a><br><br>
</body>
</html>