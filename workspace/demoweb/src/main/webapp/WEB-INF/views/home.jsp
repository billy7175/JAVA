<%@ page language="java" 
		 contentType="text/html; charset=utf-8" 
		 pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>
<head>
	<meta charset='utf-8' />
	<title>Home</title>
	<link rel='Stylesheet' href='/demoweb/styles/default.css' />
</head>
<body>

	<div id='pageContainer'>
		
		<%-- header.jsp를 실행해서 결과를 응답에 포함하세요 --%>
		<jsp:include page="/WEB-INF/views/modules/header.jsp" />
		
		<div id='content'>
			<br /><br /><br />
			<h2 style='text-align:center'>Welcome to Demo WebSite !!!</h2>
		</div>
	</div>

</body>
</html>


