<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title>로그인</title>
	<link rel="Stylesheet" href="/demoweb/styles/default.css" />
	<link rel="Stylesheet" href="/demoweb/styles/input.css" />	
</head>
<body>
	
	<div id="pageContainer">

		<jsp:include page="/WEB-INF/views/modules/header.jsp" />
			
		<div id="inputcontent">
			<br /><br />
		    <div id="inputmain">
		        <div class="inputsubtitle">로그인정보</div>
		        
		        <form action="login.action" method="post">
		        <table>
		            <tr>
		                <th>아이디(ID)</th>
		                <td>
		                    <input type="text" id="memberId" name="memberId" style="width:280px" />
		                </td>
		            </tr>
		            <tr>
		                <th>비밀번호</th>
		                <td>
		                	<input type="password" name="passwd" style="width:280px" />
		                </td>
		            </tr>
		        </table>
		        
		        <div class="buttons">
		        	<input type="submit" value="로그인" style="height:25px" />
		        	<input type="button" value="취소" style="height:25px" />
		        </div>
		        </form>
		        
		    </div>
		</div>
	
	</div>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script type="text/javascript">
	$(function() {
		<c:if test="${ loginfail ne null }">
			$('#memberId').val('${ loginfail }');
			alert("로그인 실패");
		</c:if>
	})
	</script>
</body>
</html>














