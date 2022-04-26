package com.demoweb.controller;

//import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
//	@RequestMapping(value = { "/", "/home.action" }, method = RequestMethod.GET)
	@GetMapping(value = {"/", "/home.action"})
	public String home(Model model) {				
		return "home";
	}
	
}
