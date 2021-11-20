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
	int a = ran.nextInt(8) + 2;
	int b = ran.nextInt(9) + 1;

%>
<h1>구구단게임</h1>
<h2>5문제를 맞추면 종료</h2>
<h2><%=gameCount %>번째 게임 : [점수]<%=scoreCount %>점</h2>
<form action="gugudanPro.jsp">
	<%=a %> * <%=b %> = <input type="text" name="c" value="0"> <br>
	<input type="hidden" value=<%=a %> name="a">
	<input type="hidden" value=<%=b %> name="b">
	<input type="submit" value="전송">
</form>