<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>

	<%
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		String[] genderList = (String[])session.getAttribute("genderList");
		int size = (Integer)session.getAttribute("size");
	
		
	%>
<div align="center">
	<h2>관리자 페이지(회원 정보 확인하기)</h2>
	<table border="1">
	
		<tr>
			<td width="100px">아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>성별</td>
			<td>삭제</td>
		</tr>
		<%--관리자는 제외 --%>
		<%for(int i = 1; i < size; i++){ %>			
			<tr>
				<td><%= idList[i] %></td>
				<td><%= pwList[i] %></td>
				<td><%= nameList[i] %></td>
				<td><%= genderList[i] %></td>
				<td><input type="button" value="삭제" 
				onclick="window.location.href='01_03_adminUserDelete.jsp?id=<%=idList[i]%>'"></td>
			</tr>
		
		<%} %>

	</table>
	<p></p>
	<input type="button" value="관리자페이지" onclick="window.location.href='01_01_adminMain.jsp'">
</div>