<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>

<h2>도서 등록</h2>

<form action="/book/insertBook" method="post">
    도서번호: <input type="text" name="bookNo"><br><br>
    도서명: <input type="text" name="bookName"><br><br>
    저자: <input type="text" name="bookAuthor"><br><br>
    가격: <input type="number" name="bookPrice"><br><br>
    출판일: <input type="date" name="bookDate"><br><br>
    재고: <input type="number" name="bookStock"><br><br>
    출판사: <input type="text" name="pubNo"><br><br>

    <button type="submit">등록</button>
</form>

<br>
<a href="/">메인으로</a>

</body>
</html>