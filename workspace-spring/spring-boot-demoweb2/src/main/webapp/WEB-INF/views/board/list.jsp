<%@page import="java.util.List"%>
<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8"%>
    	 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title>게시물 목록</title>
	<link rel="Stylesheet" href="/resources/styles/default.css" />
	<style type="text/css">
	a { text-decoration: none; }
	</style>
	<script src="https://code.jquery.com/jquery-3.3.1.js"></script>	
	<script type="text/javascript">
	$(function() {
		$('#write').on('click', function(event) {
			location.href="write.action";
			//location.href="/board/write.action";
		})
	});
	</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
	<div id="pageContainer">		
		<div style="padding-top:25px;text-align:center">
			
			<input id="write" type="button" value="글쓰기" 
				style="width:300px;height:25px" />
				
			<br /><br />
			
			<table border="1" align="center">
				<tr style="background-color:beige;height:25px">
					<th style="width:50px">번호</th>
					<th style="width:300px">제목</th>
					<th style="width:150px">작성자</th>
					<th style="width:120px">작성일</th>
					<th style="width:80px">조회수</th>
				</tr>
				
				<%-- //서블릿에서 request에 객체에 저장한 데이터 읽기 --%>
				<c:forEach var="board" items="${ boards }">
				<tr style="height:25px">
					<td>${ board.boardNo }</td>
					<td style='text-align:left;padding-left:5px'>
					
					<c:choose>
					<c:when test="${ board.deleted }">
						<span style="color:lightgray">${ board.title } [삭제된 글]</span>
					</c:when>
					<c:otherwise>
						<a href='detail.action?boardno=${ board.boardNo }&pageno=${ pageno }'>
						${ board.title }
						</a>
					</c:otherwise>
					</c:choose>
											
					</td>
					<td>${ board.writer }</td>
					<td>
						<fmt:formatDate value="${ board.regDate }" 
		                				pattern="yyyy년 MM월 dd일" />
		            </td>
					<td>${ board.readCount }</td>
				</tr>
				</c:forEach>
			</table>
			<br><br>
			
			${ pager }
			
		</div>
	</div>

</body>
</html>













