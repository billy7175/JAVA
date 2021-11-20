<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	
<%
  	String strNum = request.getParameter("num");	 
	int num = Integer.parseInt(strNum);
	
%>


 <h2>È¦¼öÂ¦¼öÆÇº°</h2>

<%if(num % 2 == 0) {%>
	Â¦¼ö
<%}else{ %>
	È¦¼ö
<%} %>
<hr>
<a href="_03_02_oddForm.jsp" >µÚ·Î°¡±â</a>