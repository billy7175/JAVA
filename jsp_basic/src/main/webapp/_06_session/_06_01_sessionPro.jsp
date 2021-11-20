<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Object obj = session.getAttribute("a");	
	System.out.println("0601 : " + obj);
	int a = (int)obj;
	
	obj = session.getAttribute("b");
	System.out.println("0601 : " + obj);
	int b = (int)obj;

%>
<h1>다음페이지1</h1>
<%=a %> <%=b %> <br>

<a href="_06_02_sessionPro2.jsp">다음페이지2</a>


