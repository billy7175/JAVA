<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="shopMain.jsp" ></jsp:include>


<div align="center">
	<h2 style="color:red;">홈쇼핑 회원 등록</h2>
	<form>
		<table border="1">
			<tr >
				<td width="300px" align="center">회원번호(자동발생)</td>
				<td width="400px"><input type="text"></td>
			</tr>
			<tr>
				<td align="center">회원성명</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td align="center">회원전화</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td align="center">통신사(KS KT LG)</td>
				<td >
					 <input type="radio" name="address" value="SK" checked>SK&nbsp;
			         <input type="radio" name="address" value="KT">KT&nbsp;
			         <input type="radio" name="address" value="LG">LG			
				</td>
			</tr>
			<tr>
				<td align="center">가입일자</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td align="center">고객등급(A:VIP,B:일반,C:직원)</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td align="center">도시코드</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td class="button" align="center" colspan="2">
					<input class="-submit" type="submit" value="등록">
					<input class="search" type="button" value="조회" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
<style>
	div {
		border:5px solid gold;
	}
	input[type="text"] {
		width:100%;
		padding-left:5px;
	}
</style>