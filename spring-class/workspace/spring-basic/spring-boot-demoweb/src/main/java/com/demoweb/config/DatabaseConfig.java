package com.demoweb.config;


import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource("classpath:/application.properties")
// @EnableTransactionManagement // 어노테이션 기반 트랜잭션 관리 활성화
public class DatabaseConfig {
	
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		
		HikariConfig config = new HikariConfig();

		return config;
		
	}	
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new HikariDataSource(hikariConfig());
		return dataSource;
	}
	
	/////////////////////////////////////////////////
	
//	@Bean
//	@ConfigurationProperties(prefix="spring.jpa")
//	public Properties hibernateConfig() {		
//		return new Properties();
//	}


}









