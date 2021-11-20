<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    10초 뒤에 f5눌러보세요
    <br><br>
    <% 
 		int[] temparr = (int[]) session.getAttribute("arr");
 	 	String[] tempdata = (String[]) session.getAttribute("data");
 	 	 	 	
 	 %>
	<%if(temparr != null) {%>
	
		<%for (int i = 0; i < temparr.length; i++){ %>
			<%=temparr[i] + " " + tempdata[i]%>
		<%} %>	
		
	<%} %>
