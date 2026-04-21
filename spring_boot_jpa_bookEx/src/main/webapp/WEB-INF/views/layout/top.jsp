<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header>
	<c:if test="${empty sessionScope.sid }">
		<h3><a href="<c:url value='/member/loginForm'/>">로그인</a></h3>
		<h3><a href="<c:url value='/member/joinForm'/>">회원가입</a></h3>
	</c:if>
	
	<c:if test="${not empty sessionScope.sid }">
		${sessionScope.sid } 님 환영합니다
		<h3><a href="<c:url value='/member/logout'/>">로그아웃</a></h3>
		<h3><a href="<c:url value='/'/>">홈</a></h3>
	</c:if>	
</header>