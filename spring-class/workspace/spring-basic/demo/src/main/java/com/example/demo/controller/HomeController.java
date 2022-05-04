package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping(path = { "/", "/home" })
	@ResponseBody // 반환 값이 View 이름이 아니고 응답컨텐츠임을 알려주는 annotation
	public String home() {
		
		return "Hello, Spring Boot Web Application !!!!!"; //
	}
	
}
