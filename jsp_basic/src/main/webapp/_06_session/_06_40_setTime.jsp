<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 	 
 	 <%
 		int[] arr = {10,20,30,40};	 	
 	 	String[] data = {"김철수" , "이만수" , "최영희" , "박준범"};
 	 	
 	 	session.setAttribute("arr", arr);
 	 	session.setAttribute("data", data);
 	 	session.setMaxInactiveInterval(10); // 10 초간 유지 후 삭제된다.
 	 	
 	
 	 	response.sendRedirect("_06_41_setTimePro.jsp");
 	 %>
	
