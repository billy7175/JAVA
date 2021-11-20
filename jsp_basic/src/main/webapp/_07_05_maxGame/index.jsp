<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Random ran = new Random();
	int testSize = 5;
	int numList[] = new int[testSize];
	
	for(int i = 0; i < testSize; i++){
		int r = ran.nextInt(20) + 1;
		System.out.println(r);
		numList[i] = r;
		for(int j = 0; j < i; j++){
			if(r == numList[j]){
				i -= 1;
				break;
			}
		}		
	}
	
	System.out.println(Arrays.toString(numList));
	int gameCount = 0;
	session.setAttribute("numList", numList);
	session.setAttribute("testSize", testSize);
	session.setAttribute("gameCount", gameCount);
	response.sendRedirect("maxGame.jsp");
%>


