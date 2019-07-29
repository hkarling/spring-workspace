<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th {border: 1px red solid;}
table {width: 800px;height: 600px;}
</style>
</head>
<body>
	<table>
		<tr>
			<th colspan="2"><tiles:insertAttribute name="header" /></th>
		</tr>
		<tr>
			<th><tiles:insertAttribute name="content" /></th>
			<th><tiles:insertAttribute name="sidebar" /></th>
		</tr>
		<tr>
			<th colspan="2"><tiles:insertAttribute name="header" /></th>
		</tr>
	</table>
</body>
</html>