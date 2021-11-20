<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	프로그램 내내 사용될 변수들은 미리 index 에서 session에 저장해놓는다.
 --%>

<%
	int gameCount = 0;
	int scoreCount = 0;
	session.setAttribute("gameCount", gameCount);
	session.setAttribute("scoreCount", scoreCount);
%>
<h1>구구단게임</h1>
<h2>5문제를 맞추면 종료</h2>
<a href="gugudan.jsp">게임시작</a>
    
 
    