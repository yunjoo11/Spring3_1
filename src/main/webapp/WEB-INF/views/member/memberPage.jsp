<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<h1>Member Page</h1>
	<h3>${member.id}</h3>
	<h3>${member.name}</h3>
	<h3>${member.email}</h3>
	<h3>${member.phone}</h3>
	
	<a href="../account/accountList">계좌관리</a><br>
	<a href="./memberUpdate">수정</a><br>
	<a href="./memberDelete">탈퇴</a>
	
</body>
</html>