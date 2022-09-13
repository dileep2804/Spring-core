package com.dileep.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService theFortuneService) {
		System.out.println("SwimCoach: parameterised constructor");
		fortuneService = theFortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}




	@Override
	public String getDailyWorkout() {
		return "swim 100 meter for warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
