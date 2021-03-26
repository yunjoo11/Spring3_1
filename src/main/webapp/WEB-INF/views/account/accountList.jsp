<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Account List Page</h1>
	
	<table>
		<thead>
			<tr>
				<th>AccountNumber</th>
				<th>Balance</th>
				<th>Date</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="account">
				<tr>
					<td>${account.accountNumber}</td>
					<td>${account.accountBalance}</td>
					<td>${account.accountDate}</td>
				</tr>	
			</c:forEach>
		</tbody>	
	
	</table>

</body>
</html>