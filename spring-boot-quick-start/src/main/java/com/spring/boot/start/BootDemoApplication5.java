package com.spring.boot.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class BootDemoApplication5 implements CommandLineRunner{
	
	
	private static final Logger log = LoggerFactory.getLogger(BootDemoApplication5.class);
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication5.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		if(args.length >0) {
			log.info(args[1]);
		}
	}
	
	
}
