package com.dileep.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println("DatabaseFortuneService: default constructor");
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("DataFortuneService: getDailyWorkout");
		return "get fortunes from database";
	}

}
