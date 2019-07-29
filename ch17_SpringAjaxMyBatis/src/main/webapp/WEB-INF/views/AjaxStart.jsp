<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AjaxStart.jsp</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#loadBtn').click(function() {
			$('#display').load('load');
		});
		////////////////////////////////
		$('#ajaxBtn').click(function() {
			$.ajax({
				url : "ajax", // 서버주소
				type : "post", // 전송방식 get, post, put, delete
				dataType : "text", // 서버가 보내오는 데이터 타입 - text,html, xml, json
				//data : "name=이름이다", // 서버에게 전송할 parameter 정보
				success : function(result) {
					console.log(result)
				},
				error : function() {
					console.log('오류발생')
				}
			})
		});
		////////////////////////////////
		$('#jsonBtn1').click(function() {
			$.ajax({
				url : "jsonArr", // 서버주소
				type : "post", // 전송방식 get, post, put, delete
				dataType : "json", // 서버가 보내오는 데이터 타입 - text,html, xml, json
				success : function(result) {
					var str="";
					$.each(result, function(index, item) {
						str+="<input type='checkbox' value='" + index + "'>" + item;
					})
					$('#display').html(str);
				},
				error : function() {
					console.log('오류발생')
				}
			})
		});
		////////////////////////////////
		$('#jsonBtn2').click(function() {
			$.ajax({
				url : "jsonDTO", // 서버주소
				type : "post", // 전송방식 get, post, put, delete
				dataType : "json", // 서버가 보내오는 데이터 타입 - text,html, xml, json
				success : function(result) {
					console.log(result.id + ' | ' + result.age)
				},
				error : function() {
					console.log('오류발생')
				}
			})
		});
		////////////////////////////////
		$('#jsonBtn3').click(function() {
			$.ajax({
				url : "jsonList", // 서버주소
				type : "post", // 전송방식 get, post, put, delete
				dataType : "json", // 서버가 보내오는 데이터 타입 - text,html, xml, json
				success : function(result) {
					$.each(result, function(index, item) {
						console.log(item)	
					})
				},
				error : function() {
					console.log('오류발생')
				}
			})
		});
		////////////////////////////////
		$('#jsonBtn4').click(function() {
			$.ajax({
				url : "jsonMap", // 서버주소
				type : "post", // 전송방식 get, post, put, delete
				dataType : "json", // 서버가 보내오는 데이터 타입 - text,html, xml, json
				success : function(result) {
					console.log(result)
					
				},
				error : function() {
					console.log('오류발생')
				}
			})
		});
		////////////////////////////////
	});
</script>
</head>
<body>

	<input type="button" value="load함수" id="loadBtn">
	<input type="button" value="ajax함수" id="ajaxBtn">
	<input type="button" value="json-array" id="jsonBtn1">
	<input type="button" value="json-DTO" id="jsonBtn2">
	<input type="button" value="json-List" id="jsonBtn3">
	<input type="button" value="json-Map" id="jsonBtn4">

	<hr>
	<div id="display"></div>



</body>
</html>



