package com.springexample.examplesweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
// 1. GET 방식 요청 처리 + HttpServletRequest 객체를 사용해서 데이터 읽기
// @RequestMapping(path={"/demo/param"})
////	@RequestMapping(path = {"/demo/param"}, method= RequestMethod.GET)
//	@GetMapping(path= {"/demo/param"})
//	public String proccessGetRequest(HttpServletRequest req) {
//		// 요청 데이터 읽기
//		String data1 = req.getParameter("data1");
//		String data2 = req.getParameter("data2");
//		System.out.println(data1 + data2);
//		
//		//View(.jsp)로 이동
//		return "demo/result"; // --> WEB-INF/views/+demo.result.jsp
//	}
	
	
//	@GetMapping(path= {"/demo/param"})
//	public String proccessGetRequest(String data1, String data2) {
//
//		System.out.println(data1 + data2);
//		
//		//View(.jsp)로 이동
//		return "demo/result"; // --> WEB-INF/views/+demo.result.jsp
//	}

	@GetMapping(path= {"/demo/param"})
	public String proccessGetRequest(@RequestParam(name="data1") String data3, @RequestParam(name="data2")String data4) {

		System.out.println(data3 + data4);
		
		//View(.jsp)로 이동
		return "demo/result"; // --> WEB-INF/views/+demo.result.jsp
	}


}
