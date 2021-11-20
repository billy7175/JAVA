<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>베스킨라빈스31</h1>
<h3>31이상이면 패배 </h3>
<%
	int total = 0;
	int turn = 1;
	String str = request.getParameter("play");
	int play = Integer.parseInt(str);
	if(play == 1){
		str = request.getParameter("total");
		total = Integer.parseInt(str);
		str = request.getParameter("turn");
		turn = Integer.parseInt(str);	
	}
%>
<h4>현재스코어 : <%= total%></h4>
<%if(turn % 2 == 1){ %>
	PLAYER 1 차례
<%}else{ %>
	PLAYER 2 차례 
<%} %>
<br><br>
<button onclick="window.location.href='br31Pro.jsp?total=<%=total + 1%>&turn=<%=turn%>&'"><%=total + 1 %></button>
<button onclick="window.location.href='br31Pro.jsp?total=<%=total + 2%>&turn=<%=turn%>&'"><%=total + 2%></button>
<button onclick="window.location.href='br31Pro.jsp?total=<%=total + 3%>&turn=<%=turn%>&'"><%=total + 3 %></button>
    
    
    