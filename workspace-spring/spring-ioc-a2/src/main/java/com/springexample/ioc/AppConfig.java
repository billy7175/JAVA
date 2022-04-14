package com.springexample.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring IoC 설정 클래스 --> 설정 xml과 같은 역할
public class AppConfig {
	
	// <bean id="messageService" class="MyMessageService"
	@Bean
	public MessageService messageService() { // 메서드 이름이 id
		return new MyMessageService();
	}
	
	@Bean
	public TimeService timeService() {
		return new MyTimeService();
	}
	
	@Bean 
	public ServiceConsumer serviceConsumer() {
		MyServiceConsumer serviceConsumer = new MyServiceConsumer();
		serviceConsumer.setMessageService(messageService());
		serviceConsumer.setTimeService(timeService());
		return serviceConsumer;
	}

}
