<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="layout/header.jsp"%>

<div class="container">
	<form action="/product/${update.productId}/edit" method="post">
		<div class="mb-3 mt-3">
			상품명 : <input id="name" name="productName" type="text" value=${update.productName}>
		</div>
		<div class="mb-3 mt-3">
			상품가격 : <input id="price" name="productPrice" type="text" value=${update.productPrice}>
		</div>
		<div class="mb-3 mt-3">
			상품수량 : <input id="qty"name="productQty"  type="text" value=${update.productQty}>
		</div>
		<button type="submit" class="btn btn-primary">상품수정완료</button>
		
	</form>
</div>

<%@ include file="layout/footer.jsp"%>