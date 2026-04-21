<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
	<script src="<c:url value='/js/jquery-3.7.1.min.js'/>"></script>
	<script src="<c:url value='/js/bookNoCheck.js'/>"></script>
</head>
<body>
	<h3>도서등록</h3>

	<form method="post" action="<c:url value='/book/insertBook' />">
		<table>
			<tr>
				<td>도서번호</td>
				<td><input type="text" name="bookNo" id="bookNo"><button id="bookNoCheckBtn">중복확인</button></td>
			</tr>
			<tr>
				<td>도서명</td>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<td>저자</td>
				<td><input type="text" name="bookAuthor"></td>
			</tr>
			<tr>
				<td>도서가격</td>
				<td><input type="text" name="bookPrice"></td>
			</tr>
			<tr>
				<td>출판일</td>
				<td><input type="text" name="bookDate"></td>
			</tr>
			<tr>
				<td>재고</td>
				<td><input type="text" name="bookStock"></td>
			</tr>
			<tr>
				<td>분류번호</td>
				<td><input type="text" name="pubNo"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
	<a href="<c:url value='/book/listAllBook' />">전체 도서보기로 이동</a>
	<br>
	<a href="<c:url value='/' />">홈으로 이동</a>
</body>
</html>