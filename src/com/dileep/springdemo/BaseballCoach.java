package com.dileep.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		System.out.println("inside parameterised constructor of BaseballCoach setting fortuneService");
		fortuneService = theFortuneService;
	}
	
	
	
	@Override //override this method
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneServie to get fortune
		return fortuneService.getFortune();
	}
}
