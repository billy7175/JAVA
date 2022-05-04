package com.springexample.demoweb.web;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springexample.demoweb.config.RootConfiguration;
import com.springexample.demoweb.config.WebConfiguration;

public class DemoWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() { // 공통 IoC 컨테이너 설정 클래스 요청
		
		return new Class<?>[] { RootConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() { // DispatcherServlet별 IoC 컨테이너 설정 클래스 요청
		return new Class<?>[] { WebConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		FilterRegistration characterEncodingFilter = servletContext.addFilter("characterEncodingFilter", CharacterEncodingFilter.class);
		characterEncodingFilter.setInitParameter("encoding", "UTF-8");
		characterEncodingFilter.setInitParameter("forceEncoding", "true");
		characterEncodingFilter.addMappingForUrlPatterns(null, true, "/*");
		
		super.onStartup(servletContext);
	}

}
