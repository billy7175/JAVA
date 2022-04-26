<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>

<%-- c: 라고 쓰면 "http://java.sun.com/jsp/jstl/core"로 등록된 태그라이브러리를 의미합니다. --%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>

	<meta charset="utf-8" />
	<title>글쓰기</title>
	<link rel="Stylesheet" href="/resources/styles/default.css" />
	<link rel="Stylesheet" href="/resources/styles/input2.css" />
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	
</head>
<body>

	<div id="pageContainer">
	
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<div style="padding-top:25px;text-align:center">
		<div id="inputcontent">
		    <div id="inputmain">
		        <div class="inputsubtitle">게시판 글 내용</div>
		        <table>
		            <tr>
		                <th>제목</th>
		                <td>${ requestScope.board.title }</td>
		            </tr>
		            <tr>
		                <th>작성자</th>
		                <td>${ board.writer }</td>
		            </tr>
		            <tr>
		                <th>작성일</th>
		                <td>
		                	${ board.regDate }
		                	<br>
		                	<fmt:formatDate value="${ board.regDate }" 
		                					pattern="yyyy년 MM월 dd일 (E)" />
		                </td>
		            </tr>
					<tr>
		                <th>조회수</th>
		                <td>${ board.readCount }</td>
		            </tr>
		            <tr>
		                <th>첨부파일</th>
		                <td>
		                <c:forEach var="attach" items="${ board.attachments }">
		                <a href="download.action?attachno=${ attach.attachNo }">
		                	${ attach.userFileName }
		                </a>
		                </c:forEach>
		                
		                <br>
		                
		                </td>
		            </tr>
		            <tr>
		                <th>내용</th>
		                <td style="height:200px;vertical-align:top">
<c:set var="enter" value="
" />
             				${ fn:replace( board.content, enter, "<br>") }
		                </td>
		            </tr>
		        </table>
		        <div class="buttons">
		        	<c:if test="${ not empty loginuser and board.writer eq loginuser.memberId }">
		        	[&nbsp;<a id='update-btn' href='javascript:'>수정</a>&nbsp;]
		        	[&nbsp;<a id='delete-btn' href='javascript:'>삭제</a>&nbsp;]
		        	</c:if>        	
		        	
		        	[&nbsp;<a href='list.action?pageno=${ pageno }'>목록보기</a>&nbsp;]
		        </div>
		    </div>
		</div>

		<!-- comment 쓰기 영역 -->
		<br>
		<table id="comment-list" style="width:800px;margin:0 auto">
		<thead>
        	<tr>
        		<td style="text-align: right;padding:10px">
        			<button id="show-comment-write-btn" type="button" class="btn btn-primary">댓글쓰기</button>
        		</td>
        	</tr>
        </thead>
        <tbody>
        <!-- comment list -->
        <c:if test="${ not empty board.comments and board.comments[0].commentNo	!= 0 }">
        	
			<c:forEach var="comment" items="${ board.comments }">
			<tr id="tr${ comment.commentNo }">
				<td style="text-align:left;padding:10px;border-bottom: solid 1px">
	        		<div id='commentview${ comment.commentNo }'>
	        			${ comment.writer } &nbsp;&nbsp;
	        			[${ comment.regDate }]
	                    <br /><br />	                    
	                    <span>
	                    ${ comment.deleted ? "[삭제된 글]" : comment.content }
	                    </span>
	                    <br /><br />
	                    <div style='display:${ not comment.deleted and loginuser.memberId eq comment.writer ? "block" : "none" }'>
	                    	<a class="editcomment" data-commentno='${ comment.commentNo }' href="javascript:">수정</a>
	                    	&nbsp;
	                    	<a class="deletecomment" 
	                    	   href="javascript:"
	                    	   data-commentno="${ comment.commentNo }">삭제</a>
	                    </div>
	                </div>
				</td>
        	</tr>        	
        	</c:forEach>        	
	    </c:if>
	    </tbody>
	    </table>			
		<!-- comment 표시 영역 -->
        
	</div>
	</div>
	<br><br><br><br><br>
	

	<div class="modal fade" id="comment-modal" tabindex="-1" role="dialog" aria-labelledby="comment-model-label" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="comment-model-label">댓글 쓰기</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <form id="comment-form">
	        	<input type="hidden" name="boardNo" value="${ board.boardNo }">	
	        	<input type="hidden" name="commentNo" value="-1">
				<input type="hidden" name="writer">
	          <div class="form-group">
	            <label for="content" class="col-form-label">댓글내용</label>
	            <textarea class="form-control" name="content"></textarea>
	          </div>
	        </form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
	        <button id="write-comment-btn" type="button" class="btn btn-primary">쓰기</button>
	        <button id="update-comment-btn" type="button" class="btn btn-primary">수정</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	$(function() {

		$('#delete-btn').on('click', function(event) {
			var ok = confirm('${ board.boardNo }번 글을 삭제할까요?')
			if (ok) {
				location.href='delete.action?boardno=${ board.boardNo }' + 
							  '&pageno=${ pageno }';
			}
		});
		$('#update-btn').on('click', function(event) {
			location.href='update.action?boardno=${ board.boardNo }' + 
			  			  '&pageno=${ pageno }';
		});
		$('#reply-btn').on('click', function(event) {
			location.href='reply.action?boardno=${ board.boardNo }' + 
			  			  '&pageno=${ pageno }';
		});

		//////////////////////////////////////////////////////////////////////////

		$('#show-comment-write-btn').on('click', function(event) {

			setCommentForm('0', '${ loginuser.memberId }', '');

			$('#write-comment-btn').show();
			$('#update-comment-btn').hide();
			
			$('#comment-modal').modal('show');
		});
		
		$('#write-comment-btn').on('click', function(event) {

			event.preventDefault(); //이벤트를 발생시킨 객체의 기본 동작 수행 차단
			event.stopPropagation(); //상위 객체로의 이벤트 전달 차단
			
			var content = $('#comment-form textarea').val();
			if (content.length == 0) {
				alert('댓글의 내용을 입력하세요');
				return;
			}
			
			var data = $('#comment-form').serialize(); // "boardno=xxx&writer=yyy&content=zzz"
			//var data = $('#write-comment-form').serializeArray(); // [{boardno:'xxx'}, {writer:'yyy'}, ]
			
			$.ajax({
				"url": "write-comment",
				"method": "POST",
				"data": data,
				"success": function(data, status, xhr) {
					if (data === "success") {
						alert('댓글을 등록했습니다.')
					} else {
						alert('댓글 등록 실패');
					}

					setCommentForm('', '', '');
					
					$('#comment-modal').modal('hide');
					
					//목록 갱신 (ajax)
					$('#comment-list tbody').load("get-comment-list/" + ${ board.boardNo });

				},
				"error": function(xhr, status, err) {
					
				}
			});
		});
		
		//////////////////////////
		//#comment-list 요소에 이벤트를 연결해서 (현재 또는 미래에 존재하는) .editcomment에 전달
		$('#comment-list').on('click', '.editcomment', function(event) {
			//현재 클릭된 <a 의 data-commentno 속성 값 읽기
			var commentNo = $(this).attr('data-commentno');
			var span = $('#commentview' + commentNo + ' span');

			setCommentForm(commentNo, '', span.text().trim());
			
			$('#write-comment-btn').hide();
			$('#update-comment-btn').show();

			$('#comment-modal').modal('show');
			
		});
		
		$('#comment-list').on('click', '.deletecomment', function(event) {

			event.preventDefault();
			event.stopPropagation();
			
			//현재 클릭된 <a 의 data-commentno 속성 값 읽기
			var commentNo = $(this).attr('data-commentno');
			
			var yes = confirm(commentNo + "번 댓글을 삭제할까요?");
			if (!yes) {
				return;
			}
			
			//ajax 방식으로 데이터 삭제
			$.ajax({
				"url": "delete-comment/" + commentNo,
				"method": "GET",
				"success": function(data, status, xhr) {
					alert('댓글을 삭제 했습니다.');
					$('#comment-list tbody').load("get-comment-list/" + ${ board.boardNo });					
				},
				"error": function(xhr, status, err) {
					alert('댓글 삭제 실패');
				}
			});
		});
		
		$('#update-comment-btn').on('click', function(event) {
			//현재 클릭된 <a 의 data-commentno 속성 값 읽기
			var commentNo = $('#comment-form input[name=commentNo]').val();
			var content = $('#comment-form textarea').val();
			var inputData = $('#comment-form').serialize();
			
			//ajax 방식으로 데이터 수정
			$.ajax({
				"url": "update-comment",
				"method": "POST",
				"data": inputData,
				"success": function(data, status, xhr) {
					alert('댓글을 수정했습니다.');
					var span = $('#commentview' + commentNo + ' span');					
					span.html(content.replace(/\n/gi, '<br>'));

					setCommentForm('', '', '');
					$('#comment-modal').modal('hide');
				},
				"error": function(xhr, status, err) {
					alert('댓글 수정 실패');
				}
			});
		});

		function setCommentForm(commentNo, writer, content) {
			$('#comment-form input[name=commentNo]').val(commentNo);
			$('#comment-form input[name=writer]').val(writer);
			$('#comment-form textarea').val(content);
		}

		
		
	});
	</script>	

</body>
</html>