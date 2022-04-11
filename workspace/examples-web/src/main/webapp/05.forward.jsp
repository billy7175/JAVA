<%@ page language="java" 
		 contentType="text/html; charset=utf-8" 
		 pageEncoding="utf-8"%>

<%
	pageContext.setAttribute("pc-data", "DATA FROM FORWARD (PC-DATA)");
	request.setAttribute("req-data", "DATA FROM FORWARD (REQ-DATA)");

	pageContext.forward("05.result.jsp");
%>