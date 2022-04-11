<%@ page language="java" 
		 contentType="text/html; charset=utf-8"
    	 pageEncoding="utf-8"%>
    	 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>파일 업로드 연습</title>
</head>
<body>

	<h2>파일 업로드 연습</h2>
	<form action="07.upload.jsp" 
		  method="post" enctype="multipart/form-data">
		데이터 1: <input type="text" name="data1">
		<br>
		데이터 2: <input type="text" name="data2">
		<br>
		파일 1: <input type="file" name="file1">
		<br>
		파일 2: <input type="file" name="file2">
		<br>
		<input type="submit" value="서버로 전송">
	</form>

</body>
</html>







