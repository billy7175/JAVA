package com.springexample.examplesweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.springexample.examplesweb.vo.Person;

@Controller
public class DemoController {
	
	// 1. Get 방식 요청 처리 + HttpServletRequest 객체를 사용해서 데이터 읽기
//	// @RequestMapping(path = { "/demo/param" }, method = RequestMethod.GET)
//	@GetMapping(path = { "/demo/param" })
//	public String processGetRequest(HttpServletRequest req) {		
//		// 요청 데이터 읽기
//		String data1 = req.getParameter("data1");
//		String data2 = req.getParameter("data2");
//		
//		System.out.println(data1 + " / " + data2);
//		
//		// View(.jsp)로 이동
//		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
//	}
	
	// 2. Get 방식 요청 처리 + 이름이 같은 전달인자로 데이터 읽기
//	@GetMapping(path = { "/demo/param" })
//	public String processGetRequest(String data1, String data2) {		
//		// 요청 데이터 읽기 
//		// -> 전달인자를 통해 자동으로 수신
//	
//		System.out.println(data1 + " / " + data2);
//		
//		// View(.jsp)로 이동
//		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
//	}
	
	// 3. Get 방식 요청 처리 + 이름이 다른 전달인자로 데이터 읽기
	@GetMapping(path = { "/demo/param" })
	public String processGetRequest(@RequestParam(name="data1")String data3, @RequestParam(name="data2")String data4) {		
		// 요청 데이터 읽기 
		// -> 전달인자를 통해 자동으로 수신
	
		System.out.println(data3 + " / " + data4);
		
		// View(.jsp)로 이동
		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
	}
	
	//////////////////////////////////////////////////////
	
	// 4. Post 방식 요청 처리 + Dto 객체를 사용해서 데이터 읽기
//	@PostMapping(path = { "/demo/param" })
//	public String processPostRequest(Person person) {		
//		// 요청 데이터 읽기 
//		// -> 전달인자를 통해 자동으로 수신
//	
//		System.out.println(person.getName() + " / " + person.getEmail());
//		
//		// View(.jsp)로 이동
//		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
//	}
	
	//5. 컨트롤러에서 jsp로 데이터 전달 ( HttpServletRequest 객체 사용 )
//	@PostMapping(path = { "/demo/param" })
//	public String processPostRequest(Person person, HttpServletRequest req) {		
//		// 요청 데이터 읽기 
//		// -> 전달인자를 통해 자동으로 수신
//	
//		System.out.println(person.getName() + " / " + person.getEmail());
//		
//		// .jsp에서 읽을 수 있도록 req에 저장
//		req.setAttribute("myperson", person);
//		
//		// View(.jsp)로 이동
//		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
//	}
	
	//6. 컨트롤러에서 jsp로 데이터 전달 ( Model 객체 사용, 전달하기 위한 변수 X -> 값을 가져가기 위한 변수 )
//	@PostMapping(path = { "/demo/param" })
//	public String processPostRequest(Person person, Model model) {		
//		// 요청 데이터 읽기 
//		// -> 전달인자를 통해 자동으로 수신
//	
//		System.out.println(person.getName() + " / " + person.getEmail());
//		
//		// .jsp에서 읽을 수 있도록 req에 저장
//		model.addAttribute("myperson", person);
//		
//		// View(.jsp)로 이동
//		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
//	}
	
	//7. 컨트롤러에서 jsp로 데이터 전달 ( Model 객체 사용, 이름 지정 )
	@PostMapping(path = { "/demo/param" })
	public String processPostRequest(
			// Person person, // 객체 전달인자는 자동으로 jsp로 전달 (person으로 전달)
			@ModelAttribute(name="myperson2")Person person, // 객체 전달인자는 자동으로 jsp로 전달 (person으로 전달)
			Model model) {		
		// 요청 데이터 읽기 
		// -> 전달인자를 통해 자동으로 수신
	
		System.out.println(person.getName() + " / " + person.getEmail());
		
		// .jsp에서 읽을 수 있도록 req에 저장
		model.addAttribute("myperson", person);
		
		// View(.jsp)로 이동
		return "demo/result"; // --> /WEB-INF/views/ + demo/result + .jsp
	}
	
	//8. 다른 컨트롤러로 redrict
	@GetMapping(path = { "/demo/redirect" })
	public String redirect() {
		// return "demo/result"; // jsp 이름
		return "redirect:/home";
		//return new RedirectView("/home")
	}
	//9. forward
	@GetMapping(path = { "/demo/forward" })
	public String forward() {
		// return "demo/result"; // jsp 이름
		return "forward:/resources/forward.html";
	}

}

















