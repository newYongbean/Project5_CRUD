<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	#list {
		font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
		border-collapse: collapse;
		width: 100%;
	}
	#list td, #list th {
		border: 1px solid #ddd;
		padding: 8px;
		text-align:center;
	}
	#list tr:nth-child(even){background-color: #f2f2f2;}
	#list tr:hover {background-color: #ddd;}
	#list th {
		padding-top: 12px;
		padding-bottom: 12px;
		text-align: center;
		background-color: #006bb3;
		color: white;
	}
</style>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>free board</title>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
	function logout_ok(){
		var a = confirm("정말로 로그아웃 하겠습니까?");
		if(a) location.href='../login/logout';
	}
</script>
</head>
<body>
<h1>자유게시판</h1>
<table id="list" width="90%">
<tr>
	<th>Id</th>
	<th>상품명</th>
	<th>가격</th>
	<th>할인율</th>
	<th>매수</th>
	<th>브랜드명</th>
	<th>번호</th>
	<th>브랜드 E-mail</th>
	<th>상세 내용</th>
	<th>수정</th>
	<th>삭제</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getSeq()}</td>
		<td>${u.getProductName()}</td>
		<td>${u.getPrice()}</td>
		<td>${u.getDiscount()}</td>
		<td>${u.getQuantity()}</td>
		<td>${u.getBrandName()}</td>
		<td>${u.getPhoneNum()}</td>
		<td>${u.getBrandemail()}</td>
		<td>${u.getDescriptions()}</td>
		<td><a href="editpost/${u.seq}">글 수정</a></td>
		<td><a href="javascript:delete_ok('${u.seq}')">글 삭제</a></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">새글쓰기</button>
<br/><button type="button" onclick="location.href='javascript:logout_ok()'">로그아웃</button>
</body>
</html>