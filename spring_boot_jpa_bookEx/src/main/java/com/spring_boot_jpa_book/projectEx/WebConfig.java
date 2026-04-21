package com.spring_boot_jpa_book.projectEx;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/book_images/**").addResourceLocations("file:///C:/hyunJava/workSpace/springbootWorkspace7/book_images");
	}
}
