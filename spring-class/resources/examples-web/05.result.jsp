<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	
	<h2 style="text-align:center">RESULT PAGE</h2>
	<h2 style="text-align:center"><%= pageContext.getAttribute("pc-data") %></h2>
	<h2 style="text-align:center"><%= request.getAttribute("req-data") %></h2>
	
</body>
</html>





