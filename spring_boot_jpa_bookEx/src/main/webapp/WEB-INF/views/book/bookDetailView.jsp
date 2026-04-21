<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세</title>
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
        width: 400px;
    }

    th, td {
        border: 1px solid #ccc;
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #f5f5f5;
        width: 120px;
    }

    .btn-area {
        margin-top: 20px;
    }

    a {
        margin: 0 10px;
        text-decoration: none;
    }
</style>
</head>
<body>

<h2>도서 상세 정보</h2>

<table>
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
        <th>가격</th>
        <td>${book.bookPrice}</td>
    </tr>
    <tr>
        <th>출판일</th>
        <td><fmt:formatDate value="${book.bookDate}" pattern="yyyy-MM-dd"/></td>
    </tr>
    <tr>
        <th>재고</th>
        <td>${book.bookStock}</td>
    </tr>
    <tr>
        <th>출판사</th>
        <td>${book.pubNo}</td>
    </tr>
</table>

<div class="btn-area">
    <a href="/book/updateBookForm/${book.bookNo}">수정</a>
    <a href="/book/deleteBook/${book.bookNo}">삭제</a>
    <a href="/book/listAllBook">목록</a>
</div>

</body>
</html>