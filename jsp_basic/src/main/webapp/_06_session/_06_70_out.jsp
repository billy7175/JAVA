<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

  <h2>out 내장 객체 </h2>
  <h2> out.println()활용</h2>
    
  <%
	    String name = "[자바에서html 출력할수있다.]";
	    out.println("출력되는 내용은 <b>" + name + "</b> 입니다.");
  %>
   
   
    
  <h2>위와 같은 내용 출력</h2> 
   출력되는 내용은 <b><%=name %></b> 입니다. 
