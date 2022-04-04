<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.File"%>
<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8"%>
    	 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>파일 목록</title>
</head>
<body>

<h3><a href="07.upload-form.jsp">파일 업로드</a></h3>
<hr>

<%-- 1. 업로드 파일 저장소(폴더)의 파일 목록 읽기 --%>
<%
// /example-web/upload-files 웹 경로 -> C://~ 경로로 변경
String path = application.getRealPath("/upload-files");
File file = new File(path); // 파일 또는 폴더 관리 객체
File[] files = file.listFiles(); // 폴더에 포함된 모든 파일 및 폴더 리스트 반환
%>

<%-- 2. 목록 출력 --%>
<% if (files.length == 0) { %>
<h2>업로드된 파일이 없습니다.</h2>
<% } else { %>
<h2>*** 업로드 파일 목록 ***</h2>
<% } %>

<% for (File f : files) { %>

<h3>
	[<a href="download.action?file=<%= URLEncoder.encode(f.getName(), "utf-8") %>"><%= f.getName() %></a>]
</h3>

<% } %>

</body>
</html>



















