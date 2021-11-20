<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%


	Object obj = null;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
		
	obj = session.getAttribute("count");
	int count = (int)obj;
	
	
	String str ="";
	str = request.getParameter("index");
	int index= Integer.parseInt(str);

	
	for(int i = index; i < count-1; i++){
		arr[i] = arr[i+1];
	}
	count -= 1;
	session.setAttribute("arr", arr);
	session.setAttribute("count", count);
	
	
	response.sendRedirect("01_list.jsp");
	
	
%>