package com.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//@RequestMapping(value = { "/", "/home.action" }, method = RequestMethod.GET)
	@GetMapping(value = { "/", "/home.action" })
	public String home() {				
		return "home"; // /WEB-INF/views/ + home + .jsp
	}
	
}
