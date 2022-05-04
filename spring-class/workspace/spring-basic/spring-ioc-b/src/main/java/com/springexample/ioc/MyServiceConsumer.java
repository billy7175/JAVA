package com.springexample.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Setter;

public class MyServiceConsumer implements ServiceConsumer {
	
	@Setter // setMessageService 자동 생성, 의존 주입 통로 ( property )
	private MessageService messageService;
	
	@Setter // setMessageService 자동 생성, 의존 주입 통로 ( property )
	private TimeService timeService;
	
	public MyServiceConsumer() { }
	public MyServiceConsumer(MessageService messageService, TimeService timeService) { // 의존 주입 통로
		this.messageService = messageService;
		this.timeService = timeService;
	}

	public void doSomething() {
		
		// 3. 의존 자동 주입 사용
		String message = messageService.getMessage();
		System.out.println(message);
		
		String timeString = timeService.getTimeString();
		System.out.println(timeString);
		
		
		
	}





}








