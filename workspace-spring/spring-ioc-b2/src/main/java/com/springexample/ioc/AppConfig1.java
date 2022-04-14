package com.springexample.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
// @Import(AppConfig2.class) // <import 
public class AppConfig1 implements ApplicationContextAware {
	
	@Bean
	@Scope("prototype")
	public ServiceConsumer serviceConsumer() {
		MyServiceConsumer serviceConsumer = new MyServiceConsumer();
		serviceConsumer.setMessageService(applicationContext.getBean(MessageService.class));
		serviceConsumer.setTimeService(applicationContext.getBean(TimeService.class));
		return serviceConsumer;
	}

	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
