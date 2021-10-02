package com.spring.boot.start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyApp2 {
	
	public String getAppName2() {
		return "MyApp Bean 2";
	}
}
