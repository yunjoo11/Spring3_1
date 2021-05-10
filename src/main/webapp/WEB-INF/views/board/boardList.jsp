<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container">
			
			<h2>${board} List</h2>
		
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>NUM</th>
					<th>TITLE</th>
					<th>WRITER</th>
					<th>DATE</th>
					<th>HIT</th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${list}" var="dto" >
				<tr>
					<td>${dto.num}</td>
					<td><a href="./${board}Select?num=${dto.num}">
					
					<c:catch>
					<c:forEach begin="1" end="${dto.depth}">--</c:forEach>
					</c:catch>
					${dto.title}
					</a></td>
					<td>${dto.writer}</td>
					<td>${dto.regDate}</td>
					<td>${dto.hit}</td>
				</tr>
			</c:forEach>
			</tbody>
		
		</table>
	</div>
	
	<div class="container">
	  <ul class="pagination">
	  
	  <c:if test="${pager.pre}">	
	    <li class="page-item"><a class="page-link" href="./${board}List?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}">Previous</a></li>
	   </c:if>
	   
	   <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
	   
	    <li class="page-item"><a class="page-link" href="./${board}List?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
	   </c:forEach>
	   
	    <c:if test="${pager.next}">
	    <li class="page-item"><a class="page-link" href="./${board}List?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">Next</a></li>
	    </c:if>
	  </ul>
	  
	<div class="input-group mt-3 mb-3">
	<form action="./${board}List" class="form-inline">
	  <div class="input-group-prepend">
	   <select class="form-control" name="kind" id="sel1">
	    <option>Title</option>
	    <option>Contents</option>
	    <option>Writer</option>
	  </select>
	  </div>
	  <input type="text" class="form-control" name="search" placeholder="">
	    <div class="input-group-append">
	    <button class="btn btn-success" type="submit">Search</button>
	  </div>
	 </form> 
	</div> 
  
  <a href="./${board}Insert" class="btn  btn-primary" role="button">Write</a>
  
</div>
</body>
</html>