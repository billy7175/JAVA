<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str = request.getParameter("a");
	int a = Integer.parseInt(str);
	str = request.getParameter("b");
	int b = Integer.parseInt(str);
	str = request.getParameter("c");
	int c = Integer.parseInt(str);
	str = request.getParameter("gameCount");
	int gameCount = Integer.parseInt(str);
	str = request.getParameter("scoreCount");
	int scoreCount = Integer.parseInt(str);
	
	int state = 0;
	if(a * b == c){		
		scoreCount +=1;
		state = 1;
	}else{
		state = 2;
	}
	
	if(gameCount == 5){
		state = 3;
	}	
%>	
<h1><%=gameCount %>번째게임 </h1>
<h1><%=scoreCount %>점</h1>
<%if(state == 1){%>
	<h1>정답</h1>
	<a href="gugudan.jsp?gameCount=<%=gameCount + 1%>&scoreCount=<%=scoreCount %>&play=1">뒤로가기</a>
<%}else if(state == 2){ %>
	<h1>오답</h1>
	<a href="gugudan.jsp?gameCount=<%=gameCount + 1%>&scoreCount=<%=scoreCount %>&play=1">뒤로가기</a>
<%}else if(state == 3){%>
	<h1>종료 </h1>		
	<a href="index.jsp">처음으로</a>
<%}%>