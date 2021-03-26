<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<c:import url="../template/bootStrap.jsp"></c:import>
<title>BankBook</title>
</head>
<body>
	<h1>BankBook List</h1>
	
	<c:import url="../template/header.jsp"></c:import>

	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
				<th><button>계좌개설</button></th>
			</tr>		
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>			
			</tr>
		</c:forEach>	
		</tbody>
		
	</table>

</body>
</html>