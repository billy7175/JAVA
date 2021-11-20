<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	Random ran = new Random();
	String str = request.getParameter("play");
	int play = Integer.parseInt(str);
	
	int coin = ran.nextInt(10) + 1;
	int gameCount = 1;
	int scoreCount = 0;
	if(play == 1){	
		scoreCount = Integer.parseInt(request.getParameter("scoreCount"));
		gameCount = Integer.parseInt(request.getParameter("gameCount"));
	}
%>
치트키 : <%=coin %>
<h1>홀짝게임</h1>
<h2>5문제를 맞추면 종료</h2>
<h2><%=gameCount %>번째 게임 : [점수]<%=scoreCount %>점</h2>
<button onclick="window.location.href='coinGamePro.jsp?choice=1&coin=<%=coin%>&scoreCount=<%=scoreCount%>&gameCount=<%=gameCount%>'">홀</button>
<button onclick="window.location.href='coinGamePro.jsp?choice=2&coin=<%=coin%>&scoreCount=<%=scoreCount%>&gameCount=<%=gameCount%>'">짝</button>

