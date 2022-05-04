package com.exampleweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ExampleWebListener implements ServletContextListener, HttpSessionListener {

	public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("서버가 시작되었습니다.");
	}	
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("새로운 세션이 시작되었습니다.");
    }
    public void sessionDestroyed(HttpSessionEvent se)  {
    	System.out.println("세션이 종료되었습니다.");
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("서버가 종료되었습니다.");
    }

    
	
}
