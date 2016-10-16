package com.RatingSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 
 * @author Brillio Technologies Pvt Ltd
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.RatingSystem")
public class WebApplicationConfiguration extends WebMvcConfigurerAdapter {

	 /**
		 * Spring's View Resolver Bean Creation
		 * @return ViewResolver
		 */
		@Bean(name = "viewResolver")
		public ViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setViewClass(JstlView.class);
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}

	/**
	 * Static Resources accessibility for Spring
	 * @param ResourceHandlerRegistry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/styles/**")
				.addResourceLocations("/resources/styles/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/scripts/**")
				.addResourceLocations("/resources/scripts/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/images/**")
		.addResourceLocations("/resources/images/")
		.setCachePeriod(31556926);
	}

	/**
	 * Spring Configuration Enabling.
	 * @param DefaultServletHandlerConfigurer
	 */
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
