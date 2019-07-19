<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>param/a.jsp다!</h1>
<h3>메시지 : ${message}</h3>
<h3>취미 : ${hobbies}</h3>
<c:forEach items="${hobbies}" var="hobby">
	<input type="checkbox" name="hobby" value="${hobby}">${hobby }
</c:forEach>

<h1>${message}</h1>
<c:forEach items="${fruitList}" var="fruit">
	${fruit}, 
</c:forEach>

</body>
</html>