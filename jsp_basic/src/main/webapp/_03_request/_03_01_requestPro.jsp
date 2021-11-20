<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	
<!-- 
		[1] form 데이터 처리 페이지
		
		[2] 데이터가져오는방법 
			
			(1) String strAge = request.getParameter("age");	 
			모든내용은 문자열로 변환된다. 값이 정수라면 변환해서 사용한다.
			(2) int age = Integer.parseInt(strAge);
-->
	
<%
  	String strAge = request.getParameter("age");	 
	int age = Integer.parseInt(strAge);
		
%>
당신의 나이 : <%= age %> 세 입니다.