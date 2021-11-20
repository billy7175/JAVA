<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.Random"%> 
<%--
	  	jsp 에서의 랜덤 사용법
	  	
	  	[1] 지시자 태그를 사용해서 Random 을 임포트한다.(자바때와같다)
	  		<%@page import="java.util.Random"%> 
	  	
	  	[2] 지시자 태그는 처음 jsp 페이지 셋팅 할때와 자바파일 임포트할때 사용한다. 
--%> 

<%
	Random ran = new Random();
	int a = ran.nextInt(100); // 0~99
	
%>

<%= a %>