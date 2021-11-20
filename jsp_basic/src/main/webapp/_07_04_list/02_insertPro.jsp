<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	Random ran = new Random();
	
	if(count < max){
		int r = ran.nextInt(100);
		arr[count] = r;
		count += 1;
		System.out.print("[추가성공]\n");
	}else{
		System.out.print("[가득참]\n");
	}
	
	session.setAttribute("arr", arr);
	session.setAttribute("count", count);
	
	
	response.sendRedirect("01_list.jsp");
	
%>