<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>



<%
	Object obj = session.getAttribute("a");	
	System.out.println("0602 : " + obj);
	int a = (int)obj;
	
	obj = session.getAttribute("b");
	System.out.println("0602 : " + obj);
	int b = (int)obj;

%>
<h1>다음페이지2</h1>

<%=a %> <%=b %> <br>

<a href="_06_03_sessionRemove.jsp">다음페이지3</a>



