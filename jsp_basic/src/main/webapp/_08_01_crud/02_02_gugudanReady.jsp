<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String log = (String)session.getAttribute("log");	
	if(log == null){
		response.sendRedirect("03_21_loginForm.jsp");
	}else{
		
		Random ran = new Random();
		int testSize = 5;
		int sampleSize = 4;
		int a[] = new int[testSize];
		int b[] = new int[testSize];	
		int resultList[][] = new int[testSize][sampleSize];	
		int resultIndex [] = new int[testSize];
		for(int i = 0; i < testSize; i++){		
			a[i] = ran.nextInt(8) + 2;
			b[i] = ran.nextInt(9) + 1;
			int c = a[i] * b[i];
			resultList[i][0] = c;
			for(int j = 1; j < sampleSize; j++){			
				int r1 = ran.nextInt(8) + 2;
				int r2 = ran.nextInt(9) + 1;
				resultList[i][j] = r1 * r2;
			}
			
			for(int n = 0; n < sampleSize; n++){
				boolean duplicate = false;
				for(int k = n + 1; k < sampleSize; k++){
					if(resultList[i][n] == resultList[i][k]){
						i -= 1;
						duplicate = true;
						break;
					}
				}
				if(duplicate == true){
					break;
				}
			}		
		
		}
		System.out.println("-------------------------");
		for(int i = 0; i < testSize; i++){
			for(int j = 0; j < sampleSize; j++){
				System.out.print(resultList[i][j] + " ");
			}
			System.out.println();		
		}
		
		for(int i = 0; i < testSize; i++){
			int r = ran.nextInt(sampleSize);
			resultIndex[i] = r;
			int temp = resultList[i][r];
			resultList[i][r] = resultList[i][0];
			resultList[i][0] = temp;
		}
		System.out.println("-------------------------");
		for(int i = 0; i < testSize; i++){
			for(int j = 0; j < sampleSize; j++){
				System.out.print(resultList[i][j] + " ");
			}
			System.out.println();		
		}
		
		session.setAttribute("a", a);
		session.setAttribute("b", b);
		session.setAttribute("sampleSize", sampleSize);
		session.setAttribute("testSize", testSize);
		session.setAttribute("resultList", resultList);
		session.setAttribute("resultIndex", resultIndex);
		response.sendRedirect("02_03_gugudan.jsp");
	}
%>
