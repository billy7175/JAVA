<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<%
	Random ran = new Random();
	String str = request.getParameter("play");
	int play = Integer.parseInt(str);
	
	int com = 0;
	
	if(play == 0){
		com = ran.nextInt(100) + 1;
	}else if(play == 1){
		com = Integer.parseInt(request.getParameter("com"));
	}
%>
치트키 : <%=com%>
<h1>업다운게임</h1>

<form action="updownGamePlayPro.jsp">
	<input type="text" name="me" value="0">
	<input type="hidden" value=<%=com %> name="com">
	<input type="submit" value="전송">
</form>

