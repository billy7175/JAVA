package com.demoweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demoweb.dto.Member;

@WebServlet(urlPatterns = { "/account/login.action" })
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/account/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");
		
		String memberId = req.getParameter("memberId");
		String passwd = req.getParameter("passwd");
		
		System.out.printf("[%s][%s]\n", memberId, passwd);
		
		//로그인 처리
		//1. 로그인 가능 여부 확인
		if (memberId.equals("iamuser") && passwd.equals("1234")) { // 로그인 성공 상황
			//2. 세션에 로그인 상태 기록
			HttpSession session = req.getSession();
			//session.setAttribute("loginuser", memberId); // 로그인 처리 : 세션에 데이터 기록
			
			// EL 테스트를 위해서 사용하는 코드
			Member member = new Member();
			member.setMemberId(memberId);
			member.setEmail("test@example.com");
			session.setAttribute("loginuser", member); // 로그인 처리 : 세션에 데이터 기록
			
			resp.sendRedirect("/demoweb/home.action");
		} else { // 로그인 실패 상황
			// JSP에서 읽을 수 있도록 데이터 저장
			req.setAttribute("loginfail", memberId);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/account/login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
	}

}











