package com.spring.boot.start.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MyApp3AutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	MyApp3 getMyApp3Default () {
		return () -> "MyApp3 Default";
	}
}
