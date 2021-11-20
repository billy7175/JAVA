<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC-KR");
	String[] idList = (String[])session.getAttribute("idList");
	String[] pwList = (String[])session.getAttribute("pwList");
	String[] nameList = (String[])session.getAttribute("nameList");
	String[] genderList = (String[])session.getAttribute("genderList");
	int size = (Integer)session.getAttribute("size");
	 
	String log = (String)session.getAttribute("log");
	String id = "";
 	String name = "";
 	String pw = "";
 	String gender = "";
 	for(int i = 0; i <size; i++){
 		if(idList[i].equals(log)){
 			id = idList[i];
 			name = nameList[i];
 			pw = pwList[i];
 			gender= genderList[i];
 			break;
 		}
 	}
%>
<div align="center">
   <h3>회원정보 수정</h3>
   <form method="post" action="03_32_updatePro.jsp">
	   <table border="1">
		  	<tr>
		  		<td width="100px">아이디</td> 
		  		<td width="200px"><%=id%></td> 
		  	</tr>  	
		  	<tr>
		 	 	<td>패스워드</td>
		 	 	<td><input type="password" name="pw" value="<%=pw%>"></td> 
		  	</tr>
		  	<tr>
		  		<td >이름</td>
		  		<td><input type="text" name="name" value="<%=name%>"></td>	  	
		  	</tr>
		  	<tr>
		  		<td>성별</td>
				<td>
					<%if(gender.equals("남성")){ %>
						<input type="radio" name="gender" value="남성" checked>남성
						<input type="radio" name="gender" value="여성" >여성
					<%}else{ %>	
						<input type="radio" name="gender" value="남성">남성		
						<input type="radio" name="gender" value="여성" checked>여성
					<%} %>
				</td>			  	
		  	</tr>
		  	<tr>
		  		<td colspan="2" align="center">
		  			<input type="hidden" value=<%=id %> name="id">
		  			<input type="submit" value="입력완료">
		  		</td>
		  	</tr>
	   </table>	
   </form>
   <input type="button" value="메인화면" onclick="window.location.href='02_01_main.jsp'">
</div>
