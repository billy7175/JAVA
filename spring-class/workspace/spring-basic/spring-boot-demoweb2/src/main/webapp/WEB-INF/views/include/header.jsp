<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<div id="header">
            <div class="title">
                <a href="/home.action">DEMO WEBSITE</a>
            </div>
            <div class="links">
            <%-- 로그인 여부 확인 : session에 로그인 데이터 저장 여부 확인 --%>            
		<c:choose>
	       	<c:when test="${ not empty sessionScope.loginuser }">
	       		${ loginuser.memberId } 님 환영합니다.
	            <a href="/account/logout.action">로그아웃</a>
	       	</c:when>
	       	<c:otherwise>
	       		<a href="/account/login.action">로그인</a>
	            <a href="/account/register.action">회원가입</a>
	       	</c:otherwise>
	    </c:choose>            	
            </div>
        </div>        
        <div id="menu">
            <div>
                <ul>
                <c:if test='${ not empty loginuser and loginuser.userType eq "admin" }'>
                    <li><a href="/admin/memberlist.action">사용자관리</a></li>
                </c:if>
					<li><a href="#">메일보내기</a></li>
					<li><a href="#">자료실</a></li>
					<li><a href="/board/list.action">게시판</a></li>
                </ul>
            </div>
		</div>
		<div style="text-align:right; padding: 5px; border: solid 1px; margin-top:1px">		
		[ CURRENT : ${ applicationScope.current } ]
		[ TOTAL : ${ total } ]
		</div>
		
		
		
		
		
		
		
		
		
		
		
		