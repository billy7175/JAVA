<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	session.removeAttribute("log");		// 특정 세션을 지정해서 삭제하기
	response.sendRedirect("02_01_main.jsp");
%>
		
