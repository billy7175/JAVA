<%@ page language="java" 
		 contentType="text/html; charset=utf-8" 
		 pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>
<head>
	<meta charset='utf-8' />
	<title>Home</title>
	<link rel='Stylesheet' href='/resources/styles/default.css' />
</head>
<body>

	<div id='pageContainer'>
	
		<%-- <% pageContext.include("/WEB-INF/views/include/header.jsp"); %> --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp">
			<jsp:param value="red" name="bgcolor" />
		</jsp:include>
		
		<div id='content'>
			<br /><br /><br />
			<h2 style='text-align:center'>Welcome to Demo WebSite !!!</h2>
		</div>
	</div>

</body>
</html>


