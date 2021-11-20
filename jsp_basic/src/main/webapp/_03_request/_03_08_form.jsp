<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%--
	데이터를 다른jsp로 전달하는방법 3종류 
	
	(1) form   => action="next.jsp"  
	(2) a      => href="next.jsp"
	(3) button => onclick="window.location.href='next.jsp'"

 --%>
 
 <%
 	int a = 10;
 	int b = 20;
 %>
 
 <form action="_03_08_formPro.jsp">
 	<input type="hidden" value=<%=a %> name="a">
 	<input type="hidden" value=<%=b %> name="b">
 	<input type="text" name="c" value="0">
 	<input type="submit" value="전송">
 </form>
    