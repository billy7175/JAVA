package com.springexample.examplesweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring Ioc container에 등록
public class HomeContrller {
	
	@RequestMapping(path = {"/", "/home"}) // --> / 또는 /home 오청이 수신되면 HomeContrller.home() 메서드를 호출하는 과정
	public String home() { 
		// 요청 데이터 읽기
		// 요청 처리
		// View에서 사용하도록 데이터 등록
		// View(.jsp)로 이동
		return "home"; // /WEB-INF/views/ + home + .jsp
	}
}
