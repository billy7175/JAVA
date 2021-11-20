<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
  	String str = request.getParameter("a");
	int a = Integer.parseInt(str);
	str = request.getParameter("b");
	int b = Integer.parseInt(str);
	str = request.getParameter("c");
	int c = Integer.parseInt(str);
  	
%>
    
    <%=a%> <%=b%> <%=c%>