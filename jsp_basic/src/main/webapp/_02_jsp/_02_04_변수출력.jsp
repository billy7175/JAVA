<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%--
	<% %> 스크립트릿	:  자바변수를 사용할수 있다.
	
	<%= %> 익스프레션	:  자바변수를 출력할수 있다. 
	
 --%>

<% 

	int a = 10;
	System.out.println(a);

%>	
출력 결과 : a ==> 변수 a의 안의 10이 출력되지않고, 그냥 a 그자체이다. 
<br><br>
출력 결과 : <%= a %>

