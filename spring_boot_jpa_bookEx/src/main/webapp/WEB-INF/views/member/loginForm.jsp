<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 폼</title>
		<!-- head.jsp -->
		<<%-- c:import url='/WEB-INF/views/layout/head.jsp'/> --%>
		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
		<script src="<c:url value='/js/login.js'/>"></script>
	</head>
	<body>
		<div id="wrap"> 			
			<!-- top.jsp import -->
			<c:import url='/WEB-INF/views/layout/top.jsp'/>
			<section>
		        <h1 id="title">로그인</h1>
		        <form id="loginForm" name="loginForm" >
		          <table>
		            <tr><th> ID</th><td><input type="text" id="id" name="id" ></td></tr>
		            <tr><th>비밀번호</th>
		            	<td><input type="password" id="pwd" name="pwd" autocomplete="off"></td></tr>
		             <tr>
		                <td colspan="2" align="center" id="button">
		                    <br><input type="submit" value="로그인">
		                    <input type="reset" value="취소">
		                </td>
		            </tr>             
		            </table>
		        </form>	
	        </section>
	  	 	<!-- bottom.jsp import  -->
			<%-- <c:import url='/WEB-INF/views/layout/bottom.jsp'/> --%>
	      </div>
	</body>
</html>