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
	System.out.println(id);
	System.out.println(pw);
	int index = 0;
	for(int i = 0; i < size; i++){
		if(idList[i].equals(id) && pwList[i].equals(pw)){
			index = i;
			break;
		}
	}		
	
	for(int i = index; i < size-1; i++){
		idList[i] = idList[i + 1];
		pwList[i] = pwList[i + 1];
		nameList[i] = nameList[i + 1];
		genderList[i] = genderList[i + 1];
	}	
	size -= 1;
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("size", size);
	session.removeAttribute("log");
	response.sendRedirect("02_01_main.jsp");
%>

