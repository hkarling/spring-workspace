<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>param/c.jsp다!</h1>
<h3> MemberDTO 정보확인하기</h3>
아이디 : ${memberDTO.id} <br>
이름 : ${memberDTO.name} <br>
나이 : ${memberDTO.age} <br>
주 : ${memberDTO.addr} <br>
<hr>
<h1>@ModelAttribute("dto")를 설정한 경우</h1>
아이디 : ${dto.id} <br>
이름 : ${dto.name} <br>
나이 : ${dto.age} <br>
주 : ${dto.addr} <br>
<hr>
<h1>${message}</h1>
<c:forEach items="${fruitList}" var="fruit">
	${fruit}, 
</c:forEach>
</body>
</html>