<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!-- 
	[1] form 태그 속성
		(1) action="내용을처리할페이지명"
		
	[2] input 태그 : 자바의 Scanner 처럼 내용을 입력할수있는 태그이다. 
	
	[3] input 속성 
		(1-1) type="text" 내용을 입력할수있다. 
		(1-2) name="age"  자바의 변수를 생각하면 쉽다. 
			결국 age 라는 변수에 input 에 입력된내용을 저장한다는뜻이다.  
		
		(2-1) type="submit" 버튼이고 눌르면 form 처리 페이지로 이동한다.
		
		(2-2) value="입력완료" 버튼의 내용을 적을수있다.  
  -->



<h2>나이를 입력하세요.</h2>
<form action="_03_01_requestPro.jsp">
	나이 : <input type="text" name="age"> 
	<input type="submit" value="입력완료">
</form>