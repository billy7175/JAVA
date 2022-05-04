<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<a href="08.listener.jsp">새로고침</a>
	<h3>
	<% 
	if (session.getAttribute("test") != null) {//세션이 존재하는 경우
		//세션 끝내기 -> sessionDestroyed 이벤트 발생
		session.invalidate();
		out.println("세션이 존재했었고 제거했습니다.");
	} else {
		session.setAttribute("test", "test");
		out.println("세션이 없어서 새로 등록했습니다.");
	} 
	%>
	</h3>
</body>
</html>







