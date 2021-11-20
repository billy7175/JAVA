<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	 [문제1] 1~5까지의 합을 출력하시오.  1 + 2 + 3 + 4 + 5
	 [정답1] 15
	
		
--%> 

<%
	int total = 0;
	for(int i = 1; i <= 5; i++){
		total += i;
	}
%>

<%=total %>