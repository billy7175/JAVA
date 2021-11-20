<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
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
	System.out.println(id);
	System.out.println(pw);
	System.out.println(name);
	System.out.println(gender);
	for(int i = 0; i < size; i++){
		if(idList[i].equals(id)){
			idList[i] = id;		
			pwList[i] = pw;		
			nameList[i] = name;		
			genderList[i] = gender;		
			break;
		}
	}			
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("size", size);
	response.sendRedirect("02_01_main.jsp");
%>
