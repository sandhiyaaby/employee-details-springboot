package com.PostMap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PostMappingDemo1Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	 return application.sources(PostMappingDemo1Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PostMappingDemo1Application.class, args);
		
		
	}

}
