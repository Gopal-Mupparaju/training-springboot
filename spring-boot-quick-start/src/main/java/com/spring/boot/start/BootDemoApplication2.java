package com.spring.boot.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication2 {
	
	
	private static final Logger log = LoggerFactory.getLogger(BootDemoApplication2.class);


	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication2.class, args);
		
		log.info("Boot Demo with Logger");
	}

}
