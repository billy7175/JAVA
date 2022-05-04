package com.springexample.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// 2. Spring IoC 컨테이너 사용
		GenericXmlApplicationContext context =
				// new GenericXmlApplicationContext("app-context.xml");
				new GenericXmlApplicationContext("app-context.xml", "app-context2.xml");
		
		ServiceConsumer serviceConsumer1 = (ServiceConsumer)context.getBean("serviceConsumer");
		serviceConsumer1.doSomething();
		
		ServiceConsumer serviceConsumer2 = context.getBean("serviceConsumer", ServiceConsumer.class);
		serviceConsumer2.doSomething();
		
		System.out.println(serviceConsumer1 == serviceConsumer2);
		
		context.close();
	}

}
