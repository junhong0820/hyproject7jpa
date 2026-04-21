<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 검색 결과</title>
</head>
<body>
	<h3>도서 정보 등록 결과</h3>
      <table border="1" width="300">
		<tr>
			<th>도서번호</th>
			<td>${book.bookNo}</td>
		</tr>
		<tr>
			<th>도서명</th>
			<td>${book.bookName}</td>
		</tr>
		<tr>
			<th>저자</th>
			<td>${book.bookAuthor}</td>
		</tr>
		<tr>
			<th>도서가격</th>
			<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###"/></td>
		</tr>
		<tr>
			<th>출판일</th>
			<td><fmt:formatDate value="${book.bookDate}" pattern="YYYY-MM-dd" /></td>
		</tr>
		<tr>
			<th>재고</th>
			<td>${book.bookStock}</td>
		</tr>
		<tr>
			<th>분류번호</th>
			<td>${book.pubNo}</td>
		</tr>
	</table>
      <a href="<c:url value='/book/updateBookForm/${book.bookNo }'/>">[도서 정보 수정]</a><br>
      <a href="javascript:deleteCheck()">[도서 정보 삭제]</a><br> 
	<script>
		function deleteCheck(){
			let answer = confirm("삭제하시겠습니까?");
			if(answer){
				location.href="/book/deleteBook/${book.bookNo}"
			}
		}
	</script> 
      <a href="<c:url value='/book/listAllBook' />">전체 도서보기로 이동</a><br>
      <a href="<c:url value='/' />">홈으로 이동</a>
</body>
</html>