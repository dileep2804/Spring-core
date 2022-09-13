package com.dileep.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService{

	public RestFortuneService() {
		System.out.println("RestFortuneService: default constructor");
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("RestFortuneService: getDailyFortune");
		return "get fortunes from Rest";
	}

}
