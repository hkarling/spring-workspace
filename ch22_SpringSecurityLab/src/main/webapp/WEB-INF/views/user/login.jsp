<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>user/login.jsp 입니다</h1>
	<h1><a href="${pageContext.request.contextPath}">index</a></h1>
	<h3>로그인되었다.</h3>
	<form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>