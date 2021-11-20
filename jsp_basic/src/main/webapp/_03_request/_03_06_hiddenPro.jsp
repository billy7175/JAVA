<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    

<%
	String strNum = request.getParameter("num1");	 
	int num1 = Integer.parseInt(strNum);
	
	strNum = request.getParameter("num2");	 
	int num2 = Integer.parseInt(strNum);
	
	strNum = request.getParameter("result");	 
	int result = Integer.parseInt(strNum);
	
%>
 <%=num1 %> * <%=num2 %> = <%=result %> <br>

 <a href="_03_06_hiddenForm.jsp">돌아기가</a>