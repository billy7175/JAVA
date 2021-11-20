<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <%
    	String[][] memberSampleList = {
	    			{"10001" , "김행복" , "010-1111-2222","SK" , "20151202" , "A" , "01"},
	    			{"10002" , "이축복" , "010-1111-3333","SK" , "20151206" , "B" , "01"},
	    			{"10003" , "장믿음" , "010-1111-4444","LG" , "20151001" , "B" , "30"},
	    			{"10004" , "최사랑" , "010-1111-5555","KT" , "20151113" , "A" , "30"},
	    			{"10005" , "진평화" , "010-1111-6666","SK" , "20151225" , "B" , "60"},
	    			{"10006" , "차공단" , "010-1111-7777","LG" , "20151211" , "C" , "60"},	
    			};
    	String[][] memberList = new String[100][7];
    	int memberCount = 6;
    	for(int i = 0; i < memberCount; i++){
    		for(int j = 0; j < 7; j++){
    			memberList[i][j] = memberSampleList[i][j];
    		} 		
    	}    	 	
    	String[][] salesSampleList = {
				{"10001" , "2016001" , "500","5" , "2500" , "A001" , "20160101"},
				{"10001" , "2016002" , "1000","4" , "4000" , "A002" , "20160101"},
				{"10001" , "2016003" , "500","3" , "1500" , "A008" , "20160101"},
				{"10002" , "2016004" , "2000","1" , "2000" , "A004" , "20160102"},
				{"10002" , "2016005" , "500","1" , "500" , "A001" , "20160103"},
				{"10003" , "2016006" , "1500","2" , "3000" , "A003" , "20160103"},
				{"10004" , "2016007" , "500","2" , "1000" , "A001" , "20160104"},
				{"10004" , "2016008" , "300","1" , "300" , "A005" , "20160104"},
				{"10004" , "2016009" , "600","1" , "600" , "A006" , "20160104"},
				{"10004" , "2016010" , "3000","1" , "3000" , "A007" , "20160106"},					
			};
    	
    	String[][] salesList = new String[100][7];
    	int salesCount = 10;
    	for(int i = 0; i < salesCount; i++){
    		for(int j = 0; j < 7; j++){
    			salesList[i][j] = salesSampleList[i][j];
    		} 		
    	} 	 	
    	String [][] codeList = {
    			{"01" , "서울"},
    			{"10" , "인천"},
    			{"20" , "성남"},
    			{"30" , "대전"},
    			{"40" , "광주"},
    			{"60" , "부산"},
    	};
    	
    	session.setAttribute("memberList", memberList);
    	session.setAttribute("memberCount", memberCount); 	
    	session.setAttribute("salesList", salesList);
    	session.setAttribute("salesCount", salesCount);
    	session.setAttribute("codeList", codeList);  	
    	
    	response.sendRedirect("shopMain.jsp");
    %>
    
    
    
    
    