<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[session] 
		
		session  은 배열도 저장할수있다.
 --%>

<%
	int arr1[] = {10,20,30};
	String arr2[] = {"aa","bb","cc"};
	session.setAttribute("arr1" , arr1);
	session.setAttribute("arr2" , arr2);

%>

<a href="_06_11_arrayPro.jsp">다음페이지</a>

