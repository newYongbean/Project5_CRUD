<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
<table id="edit">
<tr><td>상품명:</td><td><input type="text" name="productName"/></td></tr>
<tr><td>사진:</td><td><input type="file" name="image"/></td></tr>
<tr><td>가격:</td><td><input type="text" name="price"/></td></tr>
<tr><td>할인율:</td><td><input type="text" name="discount"/></td></tr>
<tr><td>매수:</td><td><input type="text" name="quantity"/></td></tr>
<tr><td>브랜드명:</td><td><input type="text" name="brandName"/></td></tr>
<tr><td>번호:</td><td><input type="text" name="phoneNum"/></td></tr>
<tr><td>브랜드 E-mail:</td><td><input type="email" name="brandemail"/></td></tr>
<tr><td>브랜드 주소:</td><td><input type="text" name="price"/></td></tr>
<tr><td>상새 내용:</td><td><textarea cols="50" rows="5" name="descriptions"></textarea></td></tr>
</table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>