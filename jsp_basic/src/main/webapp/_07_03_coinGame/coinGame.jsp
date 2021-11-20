<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	Random ran = new Random();
	
	Object obj = null;
	obj = session.getAttribute("scoreCount");
	int scoreCount = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;
	gameCount += 1;
	session.setAttribute("gameCount", gameCount);
	int coin = ran.nextInt(10) + 1;
		
%>
치트키 : <%=coin %>
<h1>홀짝게임</h1>
<h2>5문제를 맞추면 종료</h2>
<h2><%=gameCount %>번째 게임 : [점수]<%=scoreCount %>점</h2>
<button onclick="window.location.href='coinGamePro.jsp?choice=1&coin=<%=coin%>'">홀</button>
<button onclick="window.location.href='coinGamePro.jsp?choice=2&coin=<%=coin%>'">짝</button>

