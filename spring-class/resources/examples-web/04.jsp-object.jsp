<%@page import="java.util.Date"%>
<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8"%>
    	 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Request Object</title>
<style type="text/css">
select { width: 150px; height: 30px; }
input { height: 30px; }
</style>
</head>
<body>
	
	<%
	//request 객체는 내장객체이므로 선언 없이 바로 사용할 수 있습니다.
	String user = request.getParameter("user");
	String result = null;
	if (user != null && user.length() > 0) {
		int iUser = Integer.parseInt(user);
		int com = (int)(Math.random() * 3) + 1;
		
		if (iUser == com) {
			result = "비겼습니다.";
		} else if ( (iUser == 1 && com == 2) ||
			 (iUser == 2 && com == 3) ||
			 (iUser == 3 && com == 1) ) {
			result = "졌습니다.";
		} else {
			result = "이겼습니다.";
		}
	}
	
	//내장 객체 중에는 데이터 저장 기능을 제공하는 것도 있습니다.
	//(request, pageContext, session, application)
	pageContext.setAttribute("my-data", new Date());
	%>
	
	<form action="04.jsp-object.jsp">
		<select name="user">
			<option value="1">가위</option>
			<option value="2">바위</option>
			<option value="3">보</option>
		</select>
		<input type="submit" value="게임시작">
	</form>
	<hr>
	<div>
	<%= (result != null) ? result : "" %>
	</div>
	
	
	<h3><%= pageContext.getAttribute("my-data") %></h3>


</body>
</html>








