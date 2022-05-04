package com.demoweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/account/register.action")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 요청 데이터 읽기
		//2. 요청 처리
		//3. JSP에서 사용할 수 있도록 데이터 저장
		//4. 응답컨텐츠 생산 ( JSP로 forward 이동 )
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/account/register.jsp");
		dispatcher.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 요청 데이터 읽기
		req.setCharacterEncoding("utf-8"); // 요청 데이터를 utf-8 방식으로 읽기 설정
		String memberId = req.getParameter("memberId"); // <input ... name="memberId" > 요소에 입력된 데이터 읽기
		String passwd = req.getParameter("passwd");
		String confirm = req.getParameter("confirm");
		String email = req.getParameter("email");
		//2. 요청 처리
		System.out.printf("[%s][%s][%s][%s]\n", memberId, passwd, confirm, email);
		//3. JSP에서 사용할 수 있도록 데이터 저장
		//4. 응답컨텐츠 생산 ( JSP로 forward 이동 또는 Servlet으로 redirect 이동 )
		resp.sendRedirect("/demoweb/home.action");
		
	}

}









