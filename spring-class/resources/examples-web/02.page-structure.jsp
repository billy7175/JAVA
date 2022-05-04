<%@ page import="java.util.Date" %>
<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8" %>

<%-- 메서드 또는 변수 선언 삽입 --%>
<%!
String getTimeString() {
	return new Date().toString();
}
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>JSP Page Structure</title>
</head>
<body>
	
	<%-- 일반 실행문 삽입 --%>
	<h2><% out.println(new Date().toString()); %></h2>
	
	<%-- 출력문 삽입 : out.println의 약식표현 --%>
	<h2><%= new Date().toString() %></h2>
	<h2><%= getTimeString() %></h2>
	
	<!-- HTML 주석 (서버에서는 문자열 / 브라우저에서는 주석) -->
	<%-- JSP 주석 (서버에서 주석 / 브라우저에 응답되지 않습니다.) --%>


</body>
</html>