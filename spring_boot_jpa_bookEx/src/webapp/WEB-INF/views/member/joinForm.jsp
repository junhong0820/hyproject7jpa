<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 폼</title>
		<c:import url="/WEB-INF/views/layout/head.jsp"></c:import>
		<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
		<script type="text/javascript" src="<c:url value='/js/searchZip.js'/>"></script>
	</head>
	<body>
		<div id="wrap"> 
		<section>
	        <h1 id="title">회원 가입</h1>
	        <form id="joinForm" name="joinForm" method="post"  
	        			action="<c:url value='/member/join'/>">
	        	<table>
		            <tr>
		            	<th> 성명</th>
		           		<td><input type="text" id="memName" name="memName" ></td>
	           		</tr>
		            <tr>
		            	<th> ID</th>
		            	<td><input type="text" id="memId" name="memId" > 
		            		<input type="button" id="idCheck" value="ID 중복 체크"></td>
	            	</tr>
		            <tr>
		            	<th>비밀번호</th>
		            	<td><input type="password" id="memPwd" name="memPwd"></td>
	            	</tr>
		            <tr>
		            	<th>휴대폰 번호</th>
		            	<td><input type="text" id="memHp1" name="memHp1" size="3"> 
		                    - <input type="text" id="memHp2" name="memHp2" size="4">
		                    - <input type="text" id="memHp3" name="memHp3" size="4"></td>
                    </tr>
                    <tr>
		            	<th>이메일</th>
		            	<td><input type="email" id="memEmail" name="memEmail"></td>
	            	</tr>
                    <tr>
		            	<th>주소</th>
		            	<td colspan="3">
		            		<input type="text" id="memZipcode" name="memZipcode" size="5" readonly>
		            		<input type="button" id="searchZipBtn" name="searchZipBtn" value="우편번호 찾기"><br>
		            		<input type="text" id="memAddress1" name="memAddress1" placeholder="주소 입력"  size="40" readonly>
		            		<input type="text" id="memAddress2" name="memAddress2" placeholder="상세 주소 입력">
	            		</td>
	            	</tr>
		            	             
		             <tr>
		                <td colspan="2" align="center" id="button">
		                    <br><input type="submit" value="완료">
		                    <input type="reset" value="취소">
		                </td>
		            </tr>             
	            </table>
	      </form>	
      </section>
	      </div>
	</body>
</html>