<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	int gameCount = 0;
	int scoreCount = 0;
	session.setAttribute("gameCount", gameCount);
	session.setAttribute("scoreCount", scoreCount);
%> 
    
    
<h1>코인게임</h1>
<h2>홀짝을 맞추는게임 (5번)</h2>
<a href="coinGame.jsp">코인게임</a>