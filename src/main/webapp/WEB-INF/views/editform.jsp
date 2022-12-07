<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@page import="com.mycompany.myapp.items.ITEMSDAO, com.mycompany.myapp.items.ITEMSVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="itemsVO" method="post" action="../editok">
<form:hidden path="seq"/>
<table id="edit">
	<tr><td>상품명:</td><td><input type="text" name="productName"/></td></tr>
	<tr><td>사진:</td><td><input type="text" name="image"/></td></tr>
	<tr><td>가격:</td><td><input type="text" name="price"/></td></tr>
	<tr><td>할인율:</td><td><input type="text" name="discount"/></td></tr>
	<tr><td>매수:</td><td><input type="text" name="quantity"/></td></tr>
	<tr><td>브랜드명:</td><td><input type="text" name="brandName"/></td></tr>
	<tr><td>번호:</td><td><input type="text" name="phoneNum"/></td></tr>
	<tr><td>브랜드 E-mail:</td><td><input type="email" name="brandemail"/></td></tr>
	<tr><td>브랜드 주소:</td><td><input type="text" name="price"/></td></tr>
	<tr><td>상새 내용:</td><td><textarea cols="50" rows="5" name="descriptions"></textarea></td></tr>
</table>
<input type="submit" value="수정하기">
<input type="button" value="취소하기" onclick="history.back()"/>
</form:form>

</body>
</html>