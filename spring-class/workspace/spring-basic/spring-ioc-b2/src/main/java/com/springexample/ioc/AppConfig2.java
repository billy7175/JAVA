package com.springexample.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // Spring IoC 설정 클래스 --> 설정 xml과 같은 역할
public class AppConfig2 {
	
	// <bean id="messageService" class="MyMessageService"
	@Bean
	@Scope("prototyp")
	public MessageService messageService() { // 메서드 이름이 id
		return new MyMessageService();
	}
	
	@Bean
	public TimeService timeService() {
		return new MyTimeService();
	}

}
