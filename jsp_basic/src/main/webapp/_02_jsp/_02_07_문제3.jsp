<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	 [화폐매수]  
		거스름돈 (174900원)을 거슬러줄려고한다.
		단, 일천원짜리는 매진 되어 500원짜리로 거슬러준다면,
		각단위별로 몇장씩 나눠줘야하는가?
		
		오만원  : 3 , 일만원  : 2 , 오천원 : 0 , 
		일천원  : 0 , 오백원  : 9 , 일백원 : 4
		
--%> 
<%
	int money = 174900;
	int 오만원 = money / 50000;
	int 일만원 = money % 50000 / 10000;
	int 오천원 = money % 10000 / 5000;
	int 오백원 = money % 5000 / 500;
	int 백원 = money % 500 / 100;

%>
<%=오만원 %> <br>
<%=일만원 %> <br>
<%=오천원 %> <br>
<%=오백원 %> <br>
<%=백원 %> <br>