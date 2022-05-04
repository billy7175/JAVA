package com.demoweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demoweb.dto.Member;
import com.demoweb.service.AccountService;

@Controller
@RequestMapping(path = { "/account" })
public class AccountController {
	
	@Autowired // 객체 자동 주입
	// @Qualifier("accountService")
	@Qualifier("mapperAccountService")
	private AccountService accountService;

	// @GetMapping(path = { "/account/register" })
	@GetMapping(path = { "/register" })
	public String showRegisterForm() {
		return "account/register"; // /WEB-INF/views/ + account/register + .jsp
	}
	
	@PostMapping(path = { "/register" })
	public String register(Member member) {
		
		// 데이터 처리 : Service 객체에게 처리 요청
		accountService.registerMemberTx(member);
		
		return "redirect:/account/login";
	}
	
	// @GetMapping(path = { "/account/login" })
	@GetMapping(path = { "/login" })
	public String showLoginForm() {
		return "account/login"; // /WEB-INF/views/ + account/register + .jsp
	}
	
	@PostMapping(path = { "/login" })
	public String login(Member member, HttpSession session, Model model) {
		//1. 데이터읽기 // 전달인자를 통해 이미 데이터 수신
		//2. 요청 처리 // 서비스에 요청
		Member confirmedMember = accountService.findMemberByIdAndPasswd(member);
		if (confirmedMember != null) { // 로그인 가능한 상황
			// 로그인 처리 (세션에 데이터 저장)
			session.setAttribute("loginuser", confirmedMember);
			return "redirect:/home";
		}
		
		//3. JSP로 데이터 전달하기 위해서 데이터 저장 ( Model 타입의 전달인자에 데이터 전달 )		
		model.addAttribute("loginfail", member.getMemberId());
		//4. JSP 또는 다른 컨트롤러로 이동		
		return "account/login"; // 로그인 화면으로 다시 이동
	}
	
	// @GetMapping(path = { "/account/logout" })
	@GetMapping(path = { "/logout" })
	public String logout(HttpSession session) {
		session.removeAttribute("loginuser"); // 로그아웃 처리 : session에서 데이터 제거
		
		return "redirect:/"; //
	}
	
}














