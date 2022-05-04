package com.demoweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/account/logout.action" })
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 요청 데이터 읽기
		//2. 요청 처리 ( 로그아웃 -> 상태데이터 제거 )
		HttpSession session = req.getSession();
		session.removeAttribute("loginuser"); // 세션에서 지정된 데이터 제거
		// session.invalidate(); // 세션 전체 제거
		
		//3. JSP에서 사용할 수 있도록 데이터 저장
		//4. 응답컨텐츠 생산 ( JSP로 forward 이동 or Servlet으로 redirect )
		resp.sendRedirect("/demoweb/home.action");
	}

}









