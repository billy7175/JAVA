<%@page import="com.exampleweb.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Employee employee = new Employee(); %>
	<jsp:useBean id="employee2" class="com.exampleweb.dto.Employee" />
	
	<% employee.setName("장동건"); %>
	<jsp:setProperty name="employee2" property="name" value="김윤석" />
	
	<h2>Name : <%= employee.getName() %></h2>
	<h2>Name2 : <jsp:getProperty name="employee2" property="name" /></h2>

</body>
</html>