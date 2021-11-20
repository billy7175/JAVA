<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%	

	Object obj = null;
	obj = session.getAttribute("numList");	
	int numList[]= (int[]) obj;
	obj = session.getAttribute("testSize");
	int testSize = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;
	
	int max = numList[0];
	for(int i = 1; i < testSize; i++){
		if(max < numList[i]){
			max = numList[i];
		}
	}
	
	String str = request.getParameter("index");
	int index = Integer.parseInt(str);
	if(max == numList[index]){
		numList[index] = 0;
		session.setAttribute("numList", numList);
		gameCount += 1;
		session.setAttribute("gameCount", gameCount);
	}
	
	response.sendRedirect("maxGame.jsp");
%>

