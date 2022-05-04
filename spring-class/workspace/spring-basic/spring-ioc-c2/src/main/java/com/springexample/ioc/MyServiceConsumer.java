package com.springexample.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("serviceConsumer") // <bean id="serviceConsumer" class="MyServiceConsumer" ...
public class MyServiceConsumer implements ServiceConsumer {
	
	@Autowired // 자동 의존 객체 주입
	@Qualifier("messageService") // 주입 대상 객체의 id는 messageService
	private MessageService messageService;
	
	@Autowired
	@Qualifier("timeService")
	private TimeService timeService;
	
	public void doSomething() {
		
		// 3. 의존 자동 주입 사용
		String message = messageService.getMessage();
		System.out.println(message);
		
		String timeString = timeService.getTimeString();
		System.out.println(timeString);
		
		
		
	}





}








