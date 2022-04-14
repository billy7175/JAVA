<%@ page language="java" 
		 contentType="text/html; charset=utf-8" 
		 pageEncoding="utf-8"%>

<%
	pageContext.setAttribute("pc-data", "DATA FROM REDIRECT (PC-DATA)");
	request.setAttribute("req-data", "DATA FROM REDIRECT (REQ-DATA)");

	response.sendRedirect("05.result.jsp");
%>