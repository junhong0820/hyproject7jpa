<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h3>도서등록</h3>

	<form method="post" action="<c:url value='/book/updateBook'/>">
		<table>
			<tr>
				<td>도서번호</td>
				<td><input type="text" name="bookNo" value="${book.bookNo}"
					readonly></td>
			</tr>
			<tr>
				<td>도서명</td>
				<td><input type="text" name="bookName" value="${book.bookName}"></td>
			</tr>
			<tr>
				<td>저자</td>
				<td><input type="text" name="bookAuthor"
					value="${book.bookAuthor}"></td>
			</tr>
			<tr>
				<td>도서가격</td>
				<td><input type="text" name="bookPrice"
					value="${book.bookPrice}"></td>
			</tr>
			<tr>
				<td>출판일</td>
				<td><input type="text" name="bookDate"
					value="<fmt:formatDate value="${book.bookDate}" pattern="YYYY-MM-dd" />"></td>
			</tr>
			<tr>
				<td>재고</td>
				<td><input type="text" name="bookStock"
					value="${book.bookStock}"></td>
			</tr>
			<tr>
				<td>분류번호</td>
				<td><input type="text" name="pubNo" value="${book.pubNo}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
	<a href="<c:url value='/book/listAllBook' />">전체 도서보기로 이동</a>
	<br>
	<a href="<c:url value='/' />">홈으로 이동</a>
</body>
</html>