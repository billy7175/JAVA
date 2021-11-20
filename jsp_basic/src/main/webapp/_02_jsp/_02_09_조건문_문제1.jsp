<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[택시요금]
	
	  		택시기본요금은 10000원입니다.			  		
			기본요금으로는  10km 까지 이동 가능합니다. 					
			10km이상 이동시 추가요금이 발생합니다. 					
			추가요금은 3km이동할때마다 2300원씩 요금이 추가됩니다.							
			23km 이동거리의 총요금을 출력하시오.
			
--%> 
<%
	int move = 23;
	int pay = 0;
	int addmove = 0;
	int addpay = 0;
	if(move <= 10){
		pay = 10000;
	}else if(move > 10){
		pay = 10000;
		addmove = (move - 10) / 3;
		if((move - 10) % 3 > 0){
			addmove += 1;
		}
		addpay = addmove * 2300;
	}
%>
<%= pay + addpay %>