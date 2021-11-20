<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%	
	Object obj = null;
	obj = session.getAttribute("resultList");	
	int resultList[][] = (int[][]) obj;
	obj = session.getAttribute("resultIndex");	
	int resultIndex [] = (int[])obj;
	obj = session.getAttribute("a");
	int a[] = (int[])obj;
	obj = session.getAttribute("b");
	int b[] = (int[])obj;
	obj = session.getAttribute("testSize");
	int testSize = (int)obj;
	obj = session.getAttribute("sampleSize");
	int sampleSize = (int)obj;
	System.out.println("-------------------------");
	for(int i = 0; i < testSize; i++){
		for(int j = 0; j < sampleSize; j++){
			System.out.print(resultList[i][j] + " ");
		}
		System.out.println();		
	} 
	
	boolean check[] = new boolean [testSize];
	int [] mySelect = new int[testSize];
	int score = 0;
	for(int i = 0; i < testSize;  i++){
		String str = request.getParameter(i + "");
		int num = Integer.parseInt(str);
		mySelect[i] = num;
		if(num == resultIndex[i]){
			check[i] = true;
			score += 1;
		} 
	}
	
%>
<div align="center">
	<h1>구구단게임 결과 <%=score %></h1>
	
		<table border="1">
		<%for(int i = 0;i  < testSize; i++){ %>
			<tr>
				<td colspan=<%=sampleSize %>  width="300px"><h2><%=i + 1%>번 문제 : <%=a[i] %> * <%=b[i] %></h2></td>
			</tr>
			<tr>
			<%for(int j = 0; j < sampleSize; j++){ %>								
				<%if(j == mySelect[i]) {%>
					<%if (check[i] == true) {%>
						<td bgcolor="red"><h4 ><input  type="radio" name=<%=i %> value="<%= j %>" checked > <%=resultList[i][j] %></h4></td>
						
					<%}else{%>
						<td><h4><input type="radio" name=<%=i %> value="<%= j %>" checked > <%=resultList[i][j] %></h4></td>
					<%} %>						
				<%}else{ %>
					<td><h4><input type="radio" name=<%=i %> value="<%= j %>" disabled> <%=resultList[i][j] %></h4></td>
				<%} %>
			<%} %>
			</tr>
			
		<%} %>
		<tr>
			<td><button onclick="window.location.href='02_01_main.jsp'">처음으로</button></td>
		</tr>
		</table>
</div>
    