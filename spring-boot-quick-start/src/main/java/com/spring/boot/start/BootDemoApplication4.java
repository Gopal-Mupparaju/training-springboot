package com.spring.boot.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class BootDemoApplication4{
	
	
	private static final Logger log = LoggerFactory.getLogger(BootDemoApplication4.class);
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication4.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.boot");
		
		log.info(context.getBean(ReadAppName.class).getMyAppName());
		
	}
	
	@Component
	class ReadAppName{
		
		@Value("${application.name}")
		private String  appName;
		
		public String getMyAppName() {
			return this.appName;
		}
	}
	
	
}
