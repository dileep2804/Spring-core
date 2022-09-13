package com.dileep.springdemo;

public class HappyFortuneService implements FortuneService {

	
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: default constructor");
	}

	@Override
	public String getFortune() {
		return "this is your lucky day";
	}

}
