<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%--
	페이지를 바로이동할때 사용한다. 
 --%> 
    <h1>response</h1>

<%
	System.out.print("response");
	response.sendRedirect("_06_21_responseNext.jsp");
%>