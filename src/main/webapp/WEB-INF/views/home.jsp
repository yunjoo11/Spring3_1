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

<link rel="stylesheet" href="./resources/css/test.css">
<title>Home</title>
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<button onclick="go()">BUTTON</button>
	<button id="btn">CLICK</button>
	<button id="btn2">CLICK2</button>
	<h1>version 3</h1>



	<script type="text/javascript">
		let btn = document.getElementById("btn");
		let btn2 = document.getElementById("btn2");

		//btn2.addEventListener("click", go);
		btn2.addEventListener("click", function() {
			alert("btn2");
			go();
		});

		//btn.onclick=go;
		btn.onclick = function() {
			alert("익명함수");
			go();
		}

		function go() {
			alert("hello");
		}
	</script>


	<!-- 
	기능
	글리스트 - 누구나 접근 가능
	상세보기 - 누구나 접근 가능, 글리스트에서 제목을 클릭
	글 수정 - 관리자만 접근 가능
	글 삭제 - 관리자만 접근 가능
	글 작성 - 관리자만 접근 가능	
	Back-end
		noticeMapper
		
		- com.iu.s3.notice
		NoticeDTO
	
		NoticeDAO
			getList			: 글 리스트
			getSelect		: 글 상세보기
			setInsert		: 글 작성
			setUpdate		: 글 수정
			setDelete		: 글 삭제
			setHitUpdate	: 조회수 1증가
		
		NoticeSerive
			getList			: 글 리스트
			getSelect		: 글 상세보기
			setInsert		: 글 작성
			setUpdate		: 글 수정
			setDelete		: 글 삭제		
		NoticeController
			getList			: 글 리스트
			getSelect		: 글 상세보기
			setInsert		: 글 작성*2
			setUpdate		: 글 수정*2
			setDelete		: 글 삭제		
	Front-end
		- /WEB-INF/views/notice/
		
		글 리스트
		/notice/noticeList		GET		noticeList.jsp
		파라미터
		curPage	: 페이지번호
		
		글 상세보기
		/notice/noticeSelect	GET		noticeSelect.jsp
		
		글 작성
		/notice/noticeInsert	GET		noticeInsert.jsp
		/notice/noticeInsert	POST	글 리스트로 이동	
		
		글 수정
		/notice/noticeUpdate	GET		noticeUpdate.jsp
		/notice/noticeUpdate	POST	글 리스트로 이동
		
		글 삭제
		/notice/noticeDelete	GET		글 리스트로 이동
		
 -->


</body>
</html>