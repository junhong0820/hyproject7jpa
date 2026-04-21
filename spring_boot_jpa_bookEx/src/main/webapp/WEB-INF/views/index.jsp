<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index 페이지</title>
	</head>
	<body>
		<h3>MyBatis 사용 DB 연동 : 도서 관리</h3><br>
		
		<a href="/member/loginForm">로그인</a><br>
		<a href="/member/joinForm">회원가입</a><br>

		<a href="/book/listAllBook">전체 도서 조회</a><br>
		<a href="<c:url value='/book/listAllBook'/>">전체 도서 조회</a><br><br>
		
		<a href="<c:url value='/book/newBookForm'/>">도서 등록</a><br><br>
		
		<h3>도서 검색</h3>
		<a href="<c:url value='/book/bookSearchForm1'/>">도서검색1</a><br>
		<a href="<c:url value='/book/bookSearchForm2'/>">도서검색2</a><br>
	</body>
</html>