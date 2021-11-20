<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String log = (String)session.getAttribute("log");	

%>

<div align="center" >
	<h2>메인페이지</h2>
	
	
	<table  border="1">
		<tr>
			<td align="right" width="1000px">
				<% if(log != null){%>
						[<%=log  %>]
						<a href="03_23_logoutPro.jsp">로그아웃</a>	
						<a href="03_31_updateForm.jsp">회원정보수정</a>
						<a href="03_41_deleteForm.jsp">회원탈퇴</a>	
				<% }else if(log == null){ %>
						<a href="03_11_joinForm.jsp">회원가입</a>
						<a href="03_21_loginForm.jsp">로그인</a>	
				<%} %>
			</td>
		</tr>	
		<tr>	
			<td align="center"><img src="gugudan.jpg"></td>
		</tr>
		<tr>
			<td align="center">
				<button onclick="window.location.href='02_02_gugudanReady.jsp'">게임스타트</button>
			</td>
		</tr>
	</table>
</div>

