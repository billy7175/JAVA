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
	
	Object obj = session.getAttribute("scoreCount");
	int scoreCount = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;	
	int state = 0;
	if(a * b == c){		
		scoreCount +=1;
		session.setAttribute("scoreCount", scoreCount);
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
	<a href="gugudan.jsp">뒤로가기</a>
<%}else if(state == 2){ %>
	<h1>오답</h1>
	<a href="gugudan.jsp">뒤로가기</a>
<%}else if(state == 3){%>
	<%
		session.removeAttribute("gameCount");
		session.removeAttribute("scoreCount");
		session.removeAttribute("com");
	%>
	<h1>종료 </h1>		
	<a href="index.jsp">처음으로</a>
<%}%>