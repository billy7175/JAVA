<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <% 
 	Random ran = new Random();
 	int arr[] = new int[7]; 
 	int red = 3;
 	int blue = 4;
 	for(int i = 0; i < 7;){
 		int r = ran.nextInt(2);
 		if(r == 0 && red > 0){
 			arr[i] = 1;
 			i += 1;
 			red -= 1;
 		}else if(r == 1 && blue > 0){
 			arr[i] = 7;
 			blue -= 1;
 			i += 1;
 		}
 	}
 	session.setAttribute("arr", arr);
 	boolean check[] = new boolean[7];
 	session.setAttribute("check", check);
 	int count = 3;
 	session.setAttribute("count", count);	
 	int status = 0;
 	session.setAttribute("status", status);
 	response.sendRedirect("lottoGame.jsp");
 %>
