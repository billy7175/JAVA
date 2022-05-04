package com.springexample.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// 1. 직접 객체 생성하고 사용
//		//MyServiceConsumer serviceConsumer = new MyServiceConsumer();
//		ServiceConsumer serviceConsumer = new MyServiceConsumer();
//		serviceConsumer.doSomething();

		// 2. Spring IoC 컨테이너 사용
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
		
		// 컨테이너로부터 객체 가져오기
		ServiceConsumer serviceConsumer = context.getBean("serviceConsumer", ServiceConsumer.class);
		serviceConsumer.doSomething();
		
		context.close();
	}

}
