package com.xingfang.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jfree.util.Log;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LoadListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("===========================");
		String s = sce.getServletContext().getContextPath();
		System.out.println(s);
		sce.getServletContext().setAttribute("rootpath", s);
		System.out.println("===========================");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("----------------------------");
		
	}

}
