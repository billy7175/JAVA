<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	Object obj = null;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
		
	String str = request.getParameter("index");
	int index= Integer.parseInt(str);
	
%>

<h1>수정</h1> 
    
<form action="04_updatePro.jsp">
	<%=arr[index] %>의 값을 수정합니다.<p>
    수정할값 입력 : <input type="number" name="updateNumber">
    <input type="hidden" name="index" value=<%=index %>>
    <input type="submit">
</form>