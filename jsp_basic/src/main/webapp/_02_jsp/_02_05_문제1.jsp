<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[계단]
			철수와 영희는 가위바위보 게임을 하고있다. 
			규칙은 아래와같다.			
			이기면 계단을 3칸 올라간다.
			지면  계단을 1칸 내려간다.
			비기면 아무일도 생기지않는다. 
			계단은 총 100계단이다. 
		
			50번째 계단에서 게임을 시작한다.			
			철수는 4번이기고 2번졌다.
			철수의 현재위치를 구하시오.
--%> 
<%
	int soo = 50;
	soo = soo + 4 * 3;
	soo = soo - 2 * 1;
%>	

출력 결과 : <%= soo %>
