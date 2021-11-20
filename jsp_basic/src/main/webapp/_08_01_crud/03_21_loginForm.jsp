<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
	<h2>로그인페이지</h2>		
		<form action="03_22_loginPro.jsp" method="post">
			<table border="1">
				<tr>
					<td width="100px">아이디</td>
					<td width="200px"><input type="text" name="id"></td>
				</tr>
				<tr>
					<td width="100px">비밀번호</td>
					<td width="200px"><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"  value="로그인"></td>
				</tr>
			
			</table>			
		</form>	
		<input type="button" value="메인화면" onclick="window.location.href='02_01_main.jsp'">
	</div>