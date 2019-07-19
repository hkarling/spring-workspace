<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>결과라고오</h1>
${name}<br>
${fileName}<br>
${path}<br>
<fmt:formatNumber value="${fileSize}"/><br>
</body>
</html>