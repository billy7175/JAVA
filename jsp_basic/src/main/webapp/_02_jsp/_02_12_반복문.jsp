<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--	
	¹Ýº¹¹®
--%> 
<% 
	int  i = 0;	
%>
	
<% while( i < 10 ){ %>
	<%= i %> <br>
	<%  i++; %>
<% }%>

<hr>

<% for(int n = 0; n < 10; n++) {%>
		<%=n %>
<%} %>