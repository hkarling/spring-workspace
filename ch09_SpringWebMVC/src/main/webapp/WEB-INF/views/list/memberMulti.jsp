<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>순서</th>
			<th>state</th>
			<th>name</th>
			<th>age</th>
			<th>addr</th>			
		</tr>
		<c:forEach items="${memberListDTO.list}" var="dto" varStatus="state">
			<tr>
				<td>${state.count}</td>
				<td>${dto.state}</td>
				<td>${dto.name}</td>
				<td>${dto.age}</td>
				<td>${dto.addr}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>