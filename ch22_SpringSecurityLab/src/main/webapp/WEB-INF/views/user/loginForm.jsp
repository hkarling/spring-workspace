<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>user/loginForm.jsp 입니다</h1>

	<c:if test="${param.ng != null}">
		Login Failed!
		<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != NULL}">
			MESSAGE: ${SPRING_SECURITY_LAST_EXCEPTION.message}
		</c:if>
	</c:if>
	<!-- action="/j_spring_security_check" 예약어 -->
	<form action="${pageContext.request.contextPath}/login" method="post">
		<label>아이디:</label><input type="text" name="userid"><br>
		<!-- j_username -->
		<label>비번:</label><input type="password" name="userpass"><br>
		<!-- j_userpass -->
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<input type="submit" value="로그인"> <input type="reset" value="취소">
	</form>
</body>
</html>