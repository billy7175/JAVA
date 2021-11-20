<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--
	
	
 --%>
<%
 	for(int i = 1; i <= 10; i++){ %>
 		<%if(i > 5){ 
 			break;
 		}%>			
 		<%=i%>		
 	<% }%>
