package com.dileep.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //tell spring that it is the configuration file
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.dileep.springdemo")
public class SportConfig {

	//define bean for our sadFortune service
	@Bean  //creating a bean component manually with id ="sadFortuneService"
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //dependency injection
	}
	
}
