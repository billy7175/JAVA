<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
   <h3>회원탈퇴</h3>
   <form method="post" action="03_42_deletePro.jsp">
	   <table border="1">
		  	<tr>
		  		<td width="100px">아이디</td> 
		  		<td width="200px"><input type="text" name="id" ></td> 
		  	</tr>  	
		  	<tr>
		 	 	<td>패스워드</td>
		 	 	<td><input type="password" name="pw" ></td> 
		  	</tr>

		  	<tr>
		  		<td colspan="2" align="center">
		  			<input type="submit" value="입력완료">
		  		</td>
		  	</tr>
	   </table>	
   </form>
   <input type="button" value="메인화면" onclick="window.location.href='02_01_main.jsp'">
</div>
