<%@ page language="java" 
		 contentType="text/html; charset=utf-8" 
		 pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			
		${ comments[0].commentNo }
        <c:if test="${ not empty comments and comments[0].commentNo	!= 0 }">
			<c:forEach var="comment" items="${ comments }">
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