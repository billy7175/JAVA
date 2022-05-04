package com.demoweb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.demoweb.entity.MemberEntity;

public class AuthInterceptor implements HandlerInterceptor {
	
	// Controller가 호출되기 전에 호출되는 메서드
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("Pre Handle");
		
		String url = request.getRequestURI(); // 현재 요청 URL
		MemberEntity member = (MemberEntity)request.getSession().getAttribute("loginuser");
		if (url.contains("/board") && member == null) { // 요청 URL에 board 포함되었다면 ( 게시판 관련 요청이라면 )
			response.sendRedirect("/account/login.action");
			return false; // 요청 처리 중단
		}
		
		return true; // 컨트롤러로 요청 전달
	}
	
	// Controller가 호출된 이후에 호출되는 메서드
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Post Handle");
	}
	
	// View까지 처리가 끝난 후에 호출되는 메서드
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("After Completion");
	}

}
