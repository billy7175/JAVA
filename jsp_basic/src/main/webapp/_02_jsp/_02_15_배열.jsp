<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	    [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값의 합을 출력한다.
		 [예] 150
--%> 
<%
	int [] arr = new int[5];
	int num = 10;
	int total = 0;
	for(int i =0; i < 5; i++){
		arr[i] = num;
		num += 10;
		total += arr[i];
	}
%>
<% for(int i = 0; i < 5; i++){%>
	<%=arr[i] %>
<%} %>
<hr>
<%=total %>

