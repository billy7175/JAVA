
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	// utf-8 대소문자 상관없다.
	request.setCharacterEncoding("EUC-KR");

	String[] idList = (String[])session.getAttribute("idList");
	String[] pwList = (String[])session.getAttribute("pwList");
	String[] nameList = (String[])session.getAttribute("nameList");
	String[] genderList = (String[])session.getAttribute("genderList");
	int size = (Integer)session.getAttribute("size");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");

	boolean idCheck = false;
	for(int i = 0; i < size; i++){
		if(idList[i].equals(id)){
			idCheck = true;
			break;
		}			
	}

	if(idCheck){
		response.sendRedirect("03_11_joinForm.jsp");

	}else{		
		
		idList[size] = id;
		pwList[size] = pw;
		nameList[size] = name;
		genderList[size] = gender;
		size += 1;
		session.setAttribute("idList", idList);
		session.setAttribute("pwList", pwList);
		session.setAttribute("nameList", nameList);
		session.setAttribute("nameList", nameList);
		session.setAttribute("size", size);
		System.out.println(Arrays.toString(idList));
		
		response.sendRedirect("02_01_main.jsp");
	}
%>
	
