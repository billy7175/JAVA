<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%


	Object obj = null;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
		
	String str ="";
	str = request.getParameter("index");
	int index= Integer.parseInt(str);

	str = request.getParameter("updateNumber");
	int updateNumber= Integer.parseInt(str);
	
	arr[index] = updateNumber;
	
	session.setAttribute("arr", arr);
	
	System.out.print("[수정성공]\n");
	
	response.sendRedirect("01_list.jsp");
	
	
%>