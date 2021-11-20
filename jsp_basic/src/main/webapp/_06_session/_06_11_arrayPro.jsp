<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%	
	Object obj = session.getAttribute("arr1");
	int[] arr1 = (int[]) obj;
	obj = session.getAttribute("arr2");
	String[] arr2 = (String[]) obj;
%>


<%for(int i = 0; i < arr1.length; i++){ %>
	<%=arr1[i] %> 
<%} %>

<hr>
<%for(int i = 0; i < arr2.length; i++){ %>
	<%=arr2[i] %> 
<%} %>