<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>상품 정보</h1>
            상품명: ${productPS.productName} <br>
            상품가격: ${productPS.productPrice}원 <br>
            상품수량: ${productPS.productQty}개 <br>
            등록자Id: ${productPS.userId} <br>
            가입시간: ${productPS.createdAt}
        </body>

        </html>