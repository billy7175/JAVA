package com.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;

@EntityScan(basePackages = { "com.demoweb" })
@SpringBootApplication(
	exclude = {
		HttpEncodingAutoConfiguration.class // 
	}
)
public class SpringBootDemowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemowebApplication.class, args);
	}

}
