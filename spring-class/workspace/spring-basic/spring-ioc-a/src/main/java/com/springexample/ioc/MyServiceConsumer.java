package com.springexample.ioc;

import lombok.Setter;

public class MyServiceConsumer implements ServiceConsumer {
	
	@Setter // setMessageService 자동 생성, 의존 주입 통로 ( property )
	private MessageService messageService;
	
	@Setter // setTimeService 자동 생성, 의존 주입 통로 ( property )
	private TimeService timeService;
	

	public void doSomething() {
		
		// 1. 객체 직접 생성 + 사용
//		MyMessageService messageService = new MyMessageService();
//		String message = messageService.getMessage();
//		System.out.println(message);
		
		// 2. Spring IoC Container를 사용해서 직접 객체 요청
//		GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext("app-context.xml");
//		MessageService messageService = context.getBean("messageService", MessageService.class);
//		context.close();
//		
//		String message = messageService.getMessage();
//		System.out.println(message);
		
		// 3. 의존 자동 주입 사용
		String message = messageService.getMessage();
		System.out.println(message);
		
		String timeString = timeService.getTimeString();
		System.out.println(timeString);
		
		
		
	}





}








