<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title>글쓰기</title>
	<link rel="Stylesheet" href="/resources/styles/default.css" />
	<link rel="Stylesheet" href="/resources/styles/input2.css" />
	<style type="text/css">
	a { text-decoration: none }
	</style>
	<script type="text/javascript">
	
	</script>
		
</head>
<body>

	<div id="pageContainer">
	
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<div style="padding-top:25px;text-align:center">
		<div id="inputcontent">
		    <div id="inputmain">
		        <div class="inputsubtitle">게시판 글 수정</div>
		        <form id="updateform" action="update.action" method="post">
		        <input type="hidden" name="pageno" value='${ pageno }'>
		        <input type="hidden" name="deleted" value='${ board.deleted }'>
		        <input type="hidden" name="readCount" value='${ board.readCount }'>
		        <fmt:formatDate value="${ board.regDate }" var="regDate" pattern="yyyy-MM-dd" />
		        <input type="hidden" name="regDate" value='${ regDate }'>
		        <table>
		        	<tr>
		                <th>글번호</th>
		                <td>
		                	<input type="hidden" name="boardNo" value="${ board.boardNo }">
		                	${ board.boardNo }
		                </td>
		            </tr>
		            <tr>
		                <th>제목</th>
		                <td>
		                    <input type="text" name="title" style="width:280px"
		                    	 value="${ board.title }" >
		                </td>
		            </tr>
		            <tr>
		                <th>작성자</th>
		                <td>
		                	<input type="hidden" name="writer" value="${ board.writer }">
							${ board.writer }
		                </td>
		            </tr>
		            <tr>
		                <th>내용</th>
		                <td>		                    
		                    <textarea name="content" cols="76" 
		                    	rows="15">${ board.content }</textarea>
		                </td>
		            </tr>
		        </table>
		        <div class="buttons">
		        
			        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
			        <script type="text/javascript">
			        	$(function() {
			        		$('#update').on('click', function(event) {
				        		event.preventDefault();
			        			$('#updateform').submit();
			        		});
			        	});
			        </script>
			        
		        	<!-- <form>의 submit 수행 -->	        	
		        	<a id="update" href="javascript:">글수정</a>
		        	&nbsp;&nbsp;
		        	<a href='detail.action?boardno=${ board.boardNo }&pageno=${ pageno }'>취소</a>
		        </div>
		        </form>
		    </div>
		</div>   	
	
	</div>
	</div>

</body>
</html>