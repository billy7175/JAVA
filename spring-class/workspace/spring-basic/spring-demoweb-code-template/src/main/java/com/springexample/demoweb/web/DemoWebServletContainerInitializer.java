package com.springexample.demoweb.web;

import java.util.Set;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import com.springexample.demoweb.config.DemoWebConfiguration;

// web.xml 파일의 역할을 대신하는 클래스
public class DemoWebServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		
		// IoC Container
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(DemoWebConfiguration.class); // 설정 파일 등록 
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		
		ServletRegistration.Dynamic demoWebRegistration = ctx.addServlet("demoweb", dispatcherServlet);
		demoWebRegistration.setLoadOnStartup(1);
		demoWebRegistration.addMapping("/");
		
		// set character encoding filter
		FilterRegistration characterEncodingFilter = ctx.addFilter("characterEncodingFilter", CharacterEncodingFilter.class);
		characterEncodingFilter.setInitParameter("encoding", "UTF-8");
		characterEncodingFilter.setInitParameter("forceEncoding", "true");
		characterEncodingFilter.addMappingForUrlPatterns(null, true, "/*");
		
		
		
	}

}
