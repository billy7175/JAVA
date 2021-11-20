<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--
	[조건문]
		자바 태그와 html 태그를 잘활용해야한다. 
--%> 

<%
	int score = 17;
%>

<%if(score >= 60) {%>
	합격
<%}else{ %>
	불합격
<%} %>
    