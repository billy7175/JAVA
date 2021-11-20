<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[session] 
		
	session 은 request 와 달리 브라우저가 실행되는동안 처음부터 끝까지 데이터가 
	유지된다. 
	
	[1] session.setAttribute(키,값);
	[2] session.getAttribute(키);  object 타입으로 반환된다. 즉, 형변환을해야한다.
	[3] session.removeAttribute(키);  session 에 저장된 데이터를 삭제한다. 
	
 --%>

<%
	int a = 10;
	int b = 20;
	session.setAttribute("a" , a);
	session.setAttribute("b" , b);

%>

<a href="_06_01_sessionPro.jsp">다음페이지</a>

