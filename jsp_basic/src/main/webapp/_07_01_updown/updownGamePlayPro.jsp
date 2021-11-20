<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<%
	String str = request.getParameter("me");
	int me = Integer.parseInt(str);
	Object obj = session.getAttribute("com");
	int com = (int)obj;
%>	
<%if(me > com){%>
	<%=me %> 보다 작다. <br>
	<a href="updownGamePlay.jsp">뒤로가기</a>
<%}else if(me < com){ %>
	<%=me %> 보다 크다. <br>
	<a href="updownGamePlay.jsp">뒤로가기</a>
<%}else if(me == com){ %>
	<%
		session.removeAttribute("com");
		session.removeAttribute("cheat");
	%> 
	정답입니다. <%=com %>	<p>
	<a href="index.jsp">처음으로</a>
<%} %>



