<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 	 
<%
	request.setCharacterEncoding("EUC-KR");
	
	String str = request.getParameter("num");	
	int num = Integer.parseInt(str);

	String name = request.getParameter("name");	
	
	str = request.getParameter("grade");	
	int grade = Integer.parseInt(str);
	
	String subject = request.getParameter("subject");
	
	/*
		checkbox 는 값이 여러개이다. 즉, request.getParameter 를 사용할수없다.
		request.getParameter 를 사용하면 첫번째 값만 넘어온다. 
		아래와같이 getParameterValues를 사용해야한다. 
		
	*/
	String[] hobbies = request.getParameterValues("hobbies");
	
	String memo = request.getParameter("memo");
	
	/*
		&nbsp; 자바의 스페이스바 공백을 뜻한다. 
	*/
	
%>
<div align="center">
	<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>과목</td>
			<td>취미</td>
			<td>메모</td>
		</tr>
		
		<tr>
			<td><%=num %></td>
			<td><%=name %></td>
			<td><%=subject %></td>
			<td>	
				<%for(int i = 0; i < hobbies.length; i++){ %>
					<%= hobbies[i]%> &nbsp;
				<%} %>
			</td>
			<td><%=memo %></td>
		</tr>		
	</table>
</div>

	
