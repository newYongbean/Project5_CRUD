<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.mycompany.myapp.dao.ITEMSDAO, com.mycompany.myapp.vo.ITEMSVO,java.util.*"%>
<%@ page import="com.mycompany.myapp.vo.ITEMSVO" %>
<%@ page import="com.mycompany.myapp.dao.ITEMSDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>free board</title>
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
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deletepost.jsp?id=' + id;
	}
</script>
</head>
<body>
<h1>자유게시판</h1>
<%
	ITEMSDAO ITEMSDAO = new ITEMSDAO();
	List<ITEMSVO> list = ITEMSDAO.getItemsList();
	request.setAttribute("list",list);
%>
<table id="list" width="90%">
<tr>
	<th>Id</th>
	<th>상품명</th>
	<th>사진</th>
	<th>가격</th>
	<th>할인율</th>
	<th>매수</th>
	<th>브랜드명</th>
	<th>번호</th>
	<th>브랜드 E-mail</th>
	<th>브랜드 주소</th>
	<th>상세 내용</th>
	<th>수정</th>
	<th>삭제</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getSeq()}</td>
		<td>${u.getProductName()}</td>
		<td>${u.getImage()}</td>
		<td>${u.getPrice()}</td>
		<td>${u.getDiscount()}</td>
		<td>${u.getQuantity()}</td>
		<td>${u.getBrandName()}</td>
		<td>${u.getPhoneNum()}</td>
		<td>${u.getBrandemail()}</td>
		<td>${u.getBrandAddress()}</td>
		<td>${u.getDescriptions()}</td>
		<td>${u.getRegdate()}</td>
		<td><a href="editform.jsp?id=${u.getSeq()}">Edit</a></td>
		<td><a href="javascript:delete_ok('${u.getSeq()}')">Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/><a href="addpostform.jsp">Add New Post</a>
</body>
</html>