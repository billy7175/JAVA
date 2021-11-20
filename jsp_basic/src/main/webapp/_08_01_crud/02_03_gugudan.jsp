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
%>

<div align="center">
	<h1>구구단게임</h1>
	<form action="02_04_gugudanPro.jsp">
		<table border="1">
		<%for(int i = 0;i  < testSize; i++){ %>
			<tr>
				<td colspan=<%=sampleSize %>  width="300px"><h2><%=i + 1%>번 문제 : <%=a[i] %> * <%=b[i] %></h2></td>
			</tr>
			<tr>
			<%for(int j = 0; j < sampleSize; j++){ %>
				<td>
				<h4>
					<%if(j == 0) {%>
						<input type="radio" name=<%=i %> value="<%= j %>" checked> <%=resultList[i][j] %>
					<%}else{ %>
						<input type="radio" name=<%=i %> value="<%= j %>"> <%=resultList[i][j] %>
					<%} %>
				</h4>
				</td>
				
			<%} %>
			</tr>
			
		<%} %>
		<tr>
			<td colspan=<%=sampleSize %> align="center"><input type="submit" value="제출"></td>
		</tr>
		</table>
	</form>
</div>