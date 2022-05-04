package com.springexample.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// 2. Spring IoC 컨테이너 사용
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceConsumer serviceConsumer = context.getBean("serviceConsumer", ServiceConsumer.class);
		serviceConsumer.doSomething();
		
		context.close();
	}

}
