<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%--
	form 에서 속성값 method 를 post 로 했을경우 uri 경로에 input 값이 암호화되서
	표기가 안된다. 
	
	다음페이지에서는 인코딩처리하지않으면 한글은 깨지게된다. 

 --%>
<form action="_06_31_formPostPro.jsp" method="post">
	아이디 <input type="text" name="id" >
	<input type="submit" value="전송">
</form>
