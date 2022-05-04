<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title>로그인</title>
	<link rel="Stylesheet" href="/resources/styles/default.css" />
	<link rel="Stylesheet" href="/resources/styles/input.css" />
	<script type="text/javascript">
	<% if (request.getAttribute("loginfail") != null) { %>
	alert('로그인 실패! \n아이디와 패스워드를 확인하세요');
	<% } %>
	</script>
</head>
<body>
	
	<div id="pageContainer">
	
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<div id="inputcontent">
			<br /><br />
		    <div id="inputmain">
		        <div class="inputsubtitle">로그인정보</div>
		        
		        <form action="login.action" method="post">
		       
		        <table>
		            <tr>
		                <th>아이디(ID)</th>
		                <td>
		                    <input type="text" name="memberId" style="width:280px" />
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
		        	<input type="button" value="취소" style="height:25px"
		        		onclick="location.href='/demoweb';" />
		        </div>
		        </form>
		        
		    </div>
		</div>   	
	
	</div>

</body>
</html>