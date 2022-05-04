<%@page import="com.demoweb.dto.Member"%>
<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
    	 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<div id='header'>

            <div class="title">
                <a href="/spring-demoweb/home">DEMO WEBSITE</a>
            </div>
            <div class="links">
            	<c:choose>
            		<c:when test="${ loginuser ne null }">
	            		${ loginuser.memberId }님 반갑습니다.
		            	${ sessionScope.loginuser.memberId }님 반갑습니다.            	
		            	<a href="/spring-demoweb/account/logout">로그아웃</a>
            		</c:when>
            		<c:otherwise>
		            	<a href="/spring-demoweb/account/login">로그인</a>
		                <a href="/spring-demoweb/account/register">회원가입</a>            		
            		</c:otherwise>
            	</c:choose>            	
            </div>
        </div>
                        
        <div id="menu">
            <div>
                <ul>
                    <li><a href="#">사용자관리</a></li>
					<li><a href="#">메일보내기</a></li>
					<li><a href="#">자료실</a></li>
					<li><a href="#">게시판</a></li>
                </ul>
            </div>
		</div>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		