<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--	
	[학점]
		
	  	아래 score 시험점수에 해당하는 학점을 출력하시오.
	  	아래는 점수표이다.
	  	
	  	[점수표]
	  		100~91 이면 A학점,
	  		90~81  이면 B학점,
	 		80이하는 "재시험"
	  		
	  		단, 만점이거나, A학점과 B학점의 일의 자리가 7점이상이면 + 추가하시오.
	  		A학점과 B학점의 일의 자리가 3점이하이면 - 추가하시오.
--%> 
<%
	int score = 98;
%>

<% if(score <= 100 && score >= 97 ){%>
	A+
<%} else if(score <= 96 && score >= 94){%>
	A
<%} else if(score <= 93 && score >= 91){%>
	A-
<%} else if(score <= 90 && score >= 87){%>
	B+
<%} else if(score <= 86 && score >= 84){%>
	B
<%} else if(score <= 83 && score >= 81){%>
	B-
<%} else if(score <= 80 && score >= 0){%>
	재시험
<%}else{%>
	오류
<%}%>