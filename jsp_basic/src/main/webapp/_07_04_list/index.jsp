<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	int max = 5;
	int arr[] = new int[max];
	int count = 0;
	
	
	session.setAttribute("max", max);
	session.setAttribute("arr", arr);
	session.setAttribute("count", count);
%> 
    
    
<h1> crud</h1>
<a href="01_list.jsp">¸®½ºÆ®</a>