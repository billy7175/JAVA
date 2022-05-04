package com.springexample.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyMessageService implements MessageService {
	
	int data;
	public MyMessageService() {
		data = (int)(Math.random() * 900) + 100;
	}
	
	public String getMessage() {
		return String.format("Hello, Spring IoC Container (%d) !!!", data);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("MyMessageService.init()");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("MyMessageServce.destroy()");
	}

}
