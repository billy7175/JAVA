<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>



<%
	session.removeAttribute("a");

	Object obj = session.getAttribute("a");	
	System.out.println("0603 : " + obj);
	
	obj = session.getAttribute("b");
	System.out.println("0603 : " + obj);
%>
<h1>다음페이지3</h1>






