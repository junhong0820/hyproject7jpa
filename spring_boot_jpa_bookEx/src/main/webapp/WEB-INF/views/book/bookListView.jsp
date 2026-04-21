<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 검색 결과</title>
	</head>
	<body>
		<h3>도서 검색 결과</h3>
		<table border="1" width="700">
			<tr><th>도서번호</th>
			<th>도서명</th>
			<th>저자</th>
			<th>도서가격</th>
			<th>출판일</th>
			<th>재고</th>
			<th>분류번호</th>
			<th>사진</th>
			</tr>
			
			<c:choose>
				<c:when test="${ empty bookList }">
					<tr align="center">
						<td colspan ="8"> 찾는 도서가 없습니다. </td>
					</tr>
				</c:when>
			
				<c:otherwise>
					<c:forEach items="${ bookList }" var="book">
			<tr>
				<td><a href="<c:url value='/book/detailViewBook/${book.bookNo}' />">${book.bookNo}</a></td>
				<td>${book.bookName}</td>
				<td>${book.bookAuthor}</td>
				<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###"/></td>
				<td><fmt:formatDate value="${book.bookDate}" pattern="YYYY-MM-dd" /></td>
				<td>${book.bookStock}</td>
				<td>${book.pubNo}</td>
				<td>
					<img src="<c:url value='/book_images/${book.bookNo}.jpg'/>" width="30" height="20">
					<!-- 또는  -->
					<img src="/book_images/${book.bookNo}.jpg" width="30" height="20"> 
					
				</td>
			</tr>
			</c:forEach>
				</c:otherwise>
			</c:choose>
			
			
		</table><br>
		
		<a href="<c:url value='/' />">홈으로 이동</a>
	</body>
</html>