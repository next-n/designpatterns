package com.newnext.designpatterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProjectConfig {
	@Bean
	public NewController newController1() {
		return new NewController();
		
	}

}
