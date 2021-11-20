<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Object obj = session.getAttribute("check");
	boolean check[] = (boolean[])obj;
	
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	
	obj = session.getAttribute("count");
	int count = (int)obj;
	obj = session.getAttribute("status");
	int status = (int)obj;

	String str = request.getParameter("index");
	int index = Integer.parseInt(str);
	
	check[index] = true;
	count -= 1;
	
	if(count == 0){
		int winCount = 0;
		for(int i = 0;i < check.length; i++){
			if(check[i] == true && arr[i] == 7){
				winCount += 1;
			}
		}
		if(winCount == 3){
			status = 1;
		}else{
			status = 2;
		}
	}
	
	session.setAttribute("status", status);
	session.setAttribute("count", count);
	session.setAttribute("check", check);
	
	response.sendRedirect("lottoGame.jsp");
%>


