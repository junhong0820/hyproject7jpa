<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 수정</title>
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

    input {
        width: 100%;
        padding: 5px;
        box-sizing: border-box;
    }

    .btn-area {
        margin-top: 20px;
    }

    button {
        padding: 8px 15px;
        margin-right: 10px;
    }

    a {
        text-decoration: none;
    }
</style>
</head>
<body>

<h2>도서 수정</h2>

<form action="/book/updateBook" method="post">

    <table>
        <tr>
            <th>도서번호</th>
            <td><input type="text" name="bookNo" value="${bookDTO.bookNo}" readonly></td>
        </tr>
        <tr>
            <th>도서명</th>
            <td><input type="text" name="bookName" value="${bookDTO.bookName}"></td>
        </tr>
        <tr>
            <th>저자</th>
            <td><input type="text" name="bookAuthor" value="${bookDTO.bookAuthor}"></td>
        </tr>
        <tr>
            <th>가격</th>
            <td><input type="number" name="bookPrice" value="${bookDTO.bookPrice}"></td>
        </tr>
        <tr>
            <th>출판일</th>
            <td><input type="date" name="bookDate" value="${bookDTO.bookDate}"></td>
        </tr>
        <tr>
            <th>재고</th>
            <td><input type="number" name="bookStock" value="${bookDTO.bookStock}"></td>
        </tr>
        <tr>
            <th>출판사</th>
            <td><input type="text" name="pubNo" value="${bookDTO.pubNo}"></td>
        </tr>
    </table>

    <div class="btn-area">
        <button type="submit">수정</button>
        <a href="/book/listAllBook">목록</a>
    </div>

</form>
</body>
</html>