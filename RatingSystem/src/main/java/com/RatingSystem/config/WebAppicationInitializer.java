package com.RatingSystem.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author Brillio Technologies Pvt Ltd
 *
 */

/**
 * Deals with the Application Initialization management. Below shown operations are executed 
 * 1)Manage the life cycle of the root application context
 * 2)Dispatcher Handling
 */
@EnableAsync
public class WebAppicationInitializer implements WebApplicationInitializer {

	/**
	 * On startup initializes Context, assign listener  and handles dispatcher
	 * @param container
	 * @exception ServletException
	 * 
	 */
    @Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebApplicationConfiguration.class);

		container.addListener(new ContextLoaderListener(rootContext));

		rootContext.setServletContext(container);
		
		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(rootContext));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}