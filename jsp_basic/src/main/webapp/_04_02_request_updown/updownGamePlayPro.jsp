<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<%
	String str = request.getParameter("me");
	int me = Integer.parseInt(str);
	str = request.getParameter("com");
	int com = Integer.parseInt(str);
%>	
<%if(me > com){%>
	내가 크다.
	<a href="updownGamePlay.jsp?com=<%=com%>&play=1">뒤로가기</a>
<%}else if(me < com){ %>
	내가 작다.
	<a href="updownGamePlay.jsp?com=<%=com%>&play=1">뒤로가기</a>
<%}else if(me == com){ %>
	정답입니다. <%=com %>
	<a href="index.jsp">처음으로</a>
<%} %>



