<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
 .a{border:solid red 5px}
 span{width:150px; color:red}
 input{border:solid gray 1px}
 table{width:100%}
 th,td{border:1px gray solid; text-align:center;padding:3px}
 h2{text-align:center}
 
</style>
<script src="<c:url value='/js/jquery-1.11.1.min.js'/>"></script>

<script type="text/javascript">
 
	 

</script>
</head>


<body >
<h2>Student 입력 </h2>

<form name="insert.do" method="post" id="inForm">
<table cellspacing="0">
	<tr bgcolor="pink" >
	    <th>학번</th>
		<th>이름</th>
		<th>나이</th>
		<th>전화번호</th>	
		<th>주소</th>
	</tr>
	<tr>
	    <td style="text-align:left"><input type="text" size="8" name="stNo" id="stNo"> <span>학번중복결과여부</span></td>
		<td><input type="text" size="8" name="stName" id="stName"></td>
		<td><input type="text" size="4" name="stAge" id="stAge"></td>
		<td><input type="text" size="12" name="stPhone" id="stPhone"></td>
		<td><input type="text" size="30" name="stAddr" id="stPhone"></td>
	</tr>
	<tr>
		<td colspan="5" align="center"> 
			<input type="button" value="가입하기"  id="btn">
		</td>
	</tr>
</table>

<br>

</form>

<hr color="red">

<h2> Student 리스트 !  </h2>
<table cellspacing="0" > 
	<tr>
		<td style="text-align:right"><input type="button" value="가져오기"  id="customSel"></td>
	</tr>
</table>

<table  id="listTable" cellspacing="0">
	<tr bgcolor="pink">
	    <th>학번</th>
		<th>이름</th>
		<th>나이</th>
		<th>전화번호</th>	
		<th>주소</th>
		<th>삭제</th>
	</tr>
	
	
	
</table>



</body>
</html>