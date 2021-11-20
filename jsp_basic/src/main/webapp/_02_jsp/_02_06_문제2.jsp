<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[데이트]
	
	  [설명] 
	 	- 철수와 영희는 50000원 을 가지고있다. 
	 	- 철수와 영희는 같이 영화 1편을 봤다.
	 	- 간식은 팝콘1개와 콜라 2개를 사먹었다.
	  [문제] 남은돈은 얼마인가? 
	  [힌트] 
	 		1) 콜라1개는  팝콘1개 보다 4000원 싸다.
	 		2) 영화 1편의 가격은 12000 원이다.
	 		3) 팝콘의 가격은 영화의  0.6 가격이다.  
		
--%> 

<%
	int soo = 50000;
	int movie = 12000;
	double pop = movie * 0.6;
	int col = (int)pop - 4000;
	soo = soo - (col * 2 + (int)pop + movie * 2);
	
%>
<%= soo %>