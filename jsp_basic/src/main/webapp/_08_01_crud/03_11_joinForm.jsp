<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
	<h2>회원가입</h2>
	<form action="03_12_joinPro.jsp" method="post">
		<table  border="1">
			<tr>			
				<td width="100px">아이디</td>
				<td width="200px"><input type="text" name="id"></td>	
			</tr>
			<tr>			
				<td>비밀번호</td>
				<td><input type="text" name="pw"></td>	
			</tr>
			<tr>			
				<td>이름</td>
				<td><input type="text" name="name"></td>	
			</tr>
			<tr>			
				<td>성별</td>
				<td>
					<input type="radio" name="gender" value="남성" checked>남성
					<input type="radio" name="gender" value="여성">여성
				</td>	
			</tr>
			<tr>			
				<td colspan="2" align="center"><input type="submit"  value="회원가입"></td>									
			</tr>
		</table>
	</form>
	<input type="button" value="메인화면" onclick="window.location.href='02_01_main.jsp'">
</div>
