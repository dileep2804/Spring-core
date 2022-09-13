package com.dileep.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: default constructor");
	}
	@Override
	public String getDailyFortune() {
		System.out.println("HappyFortuneService: getDailyFortune");
		return " >>Today is your lucky day!";
	}

}
