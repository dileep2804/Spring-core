package com.dileep.springdemo;

public class CricketCoach implements Coach {

	
	private String emailAddress;
	private String TeamName;
	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside default constructor");
	}
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setemail");
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	
	public void setTeamName(String name) {
		System.out.println("CricketCoach: inside setname ");
		this.TeamName = name;
	}
	public String getTeamName() {
		return TeamName;
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 1 hrs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
