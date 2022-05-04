package com.springexample.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		// 2. Spring IoC 컨테이너 사용
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig1.class, AppConfig2.class);
		
		ServiceConsumer serviceConsumer1 = context.getBean("serviceConsumer", ServiceConsumer.class);
		serviceConsumer1.doSomething();
		
		ServiceConsumer serviceConsumer2 = context.getBean("serviceConsumer", ServiceConsumer.class);
		serviceConsumer2.doSomething();
		
		System.out.println(serviceConsumer1 == serviceConsumer2);
		
		context.close();
	}

}
