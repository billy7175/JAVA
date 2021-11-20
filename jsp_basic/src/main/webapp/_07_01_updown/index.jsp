<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%--
	프로그램 내내 사용될 변수들은 미리 index 에서 session에 저장해놓는다.
 --%>
<%
	Random ran = new Random();
	int com = ran.nextInt(100) + 1;
	session.setAttribute("com" , com);
	session.setAttribute("cheat", 0);

%>
<h1>업다운게임</h1>


<a href="updownGamePlay.jsp">게임시작</a>


