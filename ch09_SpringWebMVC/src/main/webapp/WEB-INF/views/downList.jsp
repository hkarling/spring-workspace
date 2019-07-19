<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>다운로드 리스트</h1>
	<ul>
		<c:forEach items="${fileNames}" var="fname">
			<li><a href="downLoad.do?fname=${fname}">${fname }</a></li>
		</c:forEach>
	</ul>
</body>
</html>