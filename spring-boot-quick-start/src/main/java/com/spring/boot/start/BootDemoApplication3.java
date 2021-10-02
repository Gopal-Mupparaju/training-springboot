package com.spring.boot.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.boot.start.config.MyApp;
import com.spring.boot.start.config.MyApp2;
import com.spring.boot.start.config.MyApp3;
import com.spring.boot.start.config.MyApp3Impl;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class BootDemoApplication3{
	
	
	private static final Logger log = LoggerFactory.getLogger(BootDemoApplication3.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication3.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.boot");

		/*log.info(context.getBean(MyApp.class).getAppName());
		
		log.info(context.getBean(MyApp2.class).getAppName2());*/
		
		log.info(context.getBean(MyApp3.class).getAppName());
	}
	
	@Bean
	MyApp3 getMyApp() {
		return new MyApp3Impl();
	}

}
