<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	width: 800px;
	border: 5px green solid;
}

td, th {
	text-align: center;
	border: 1px gray solid;
}

a {
	text-decoration: none;
}
</style>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
<script>
	$(document).on("click", "a[name=del]", function() {
		var str = $(this).parent().parent().find("#code").text();
		location.href = "${pageContext.request.contextPath}/del/" + str;
	});
</script>
</head>
<body>
	${pageContext.request.contextPath}
	<table>
		<caption>
			<h1>[ Product List Page ]</h1>
		</caption>
		<tr>
			<th>번호</th>
			<th>상품코드</th>
			<th>상품이름</th>
			<th>상품가격</th>
			<th>상품설명</th>
			<th>삭제하기</th>
		</tr>
		<c:choose>
			<c:when test="${list.size() == 0}">
				<tr>
					<th colspan="6">등록된 상품이 없습니다.</th>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list}" var="item" varStatus="state">
					<tr>
						<th>${state.count}</th>
						<th id="code">${item.code}</th>
						<th>${item.name}</th>
						<th>${item.price}</th>
						<th>${item.detail}</th>
						<th><a name="del" href="#">삭제하기</a></th>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<th colspan="6"><a href="insertForm.ko">상품등록하기</a></th>
		</tr>
	</table>
</body>
</html>