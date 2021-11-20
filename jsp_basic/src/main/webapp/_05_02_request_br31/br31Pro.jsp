<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	String str = request.getParameter("total");
	int total = Integer.parseInt(str);
	str = request.getParameter("turn");
	int turn = Integer.parseInt(str);	
		
	int state = 0;
	
	if(total >= 31 && turn % 2 == 1){
		state = 1;
	}
	else if(total >= 31 && turn % 2 == 0){
		state = 2;
	}
	
%>
<%if(turn % 2 == 1){ %> 
	<h2>p1 차례 </h2><br>
<%}else{ %>
	<h2>p2 차례 </h2><br>
<%} %>
<h4>현재스코어 : <%= total %></h4>

<%if(state == 1){ %>
	<h1>PLAYER 2 승리</h1>
	<a href="index.jsp">처음으로 </a>
<%}else if(state == 2){ %>
	<h1>PLAYER 1 승리</h1>
	<a href="index.jsp">처음으로 </a>
<%}else{ %>
	<a href="br31.jsp?total=<%=total%>&turn=<%=turn+1%>&play=1">뒤로가기 </a>
<%}%>