package com.dileep.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		System.out.println("TrackCoach: parameterised constructor ");
		fortuneService=theFortuneService;
	}
	public TrackCoach() {
		System.out.println("TrackCoach: default constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "just Do it: " + fortuneService.getFortune();
	}

	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: iniside init method");
	}
	
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside destroy method");
	}
}
