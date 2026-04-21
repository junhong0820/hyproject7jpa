<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
<style>
    body {
        font-family: Arial;
        text-align: center;
    }

    h2 {
        margin-top: 40px;
    }

    table {
        margin: 20px auto;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid #ccc;
        padding: 10px 15px;
    }

    a {
        text-decoration: none;
        margin: 0 5px;
    }

    .bottom-link {
        margin-top: 20px;
    }
</style>

</head>
<body>

<h2>도서 목록</h2>

<table>
    <tr>
        <th>도서번호</th>
        <th>도서명</th>
        <th>저자</th>
        <th>가격</th>
        <th>상세</th>
        <th>삭제</th>
    </tr>

    <c:forEach var="book" items="${bookList}">
        <tr>
            <td>${book.bookNo}</td>
            <td>${book.bookName}</td>
            <td>${book.bookAuthor}</td>
            <td>${book.bookPrice}</td>
            <td>
                <a href="/book/detailViewBook/${book.bookNo}">상세보기</a>
            </td>
            <td>
                <a href="/book/deleteBook/${book.bookNo}">삭제</a>
            </td>
        </tr>
    </c:forEach>
</table>

<div class="bottom-link">
    <a href="/">메인으로</a>
</div>
</body>
</html>