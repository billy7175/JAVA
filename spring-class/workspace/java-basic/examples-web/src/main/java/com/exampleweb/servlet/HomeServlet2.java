package com.exampleweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home2.action" }) // web.xml 파일의 servlet 설정을 대신하는 annotation
public class HomeServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Hello, Servlet 2 !!!!!!</h2>");
		out.println("<h2>" + new Date().toString() + "</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	
}
