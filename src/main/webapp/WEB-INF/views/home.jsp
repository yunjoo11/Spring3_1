<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>

<title>Home</title>
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<a href="./bankbook/bankbookList">BankBook List</a>


	<c:if test="${empty member}">
		<a href="./member/memberJoin">Join</a>
		<a href="./member/memberLogin">Login</a>
	</c:if>

	<c:if test="${not empty member}">
		<h3>${member.id}님 환영 합니다</h3>
		<a href="./member/memberPage">MyPage</a>
		<a href="./member/memberLogout">Logout</a>
	</c:if>

</body>
</html>