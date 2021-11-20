<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	// form 에서 method 속성값이 post 인경우 인코딩처리한다. 
	request.setCharacterEncoding("EUC-KR");

	String id = request.getParameter("id");
	
%>

<%=id %>
