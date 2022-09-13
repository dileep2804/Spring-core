package com.dileep.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component           
@Scope("singleton")	
//spring will automatically register
// this bean as beanid="thatSillyCoach"
// if not specified default bean id is 
// className with first letter as small as "tennisCoach"

public class TennisCoach implements Coach {

//	@Autowired  //field injection 
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: default constructor");
	}
	
	
	// constructor injection
     @Autowired  //automatically inject FortuneService object to this class
     public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
		System.out.println("TennisCoach: parameterised constructor");
		fortuneService=theFortuneService;
	}
	
	
	/*
	//settor injectioin
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: setFortuneService");
		this.fortuneService=fortuneService;
	}
	*/
	
	/*
	//any method
	@Autowired
	public void sfdasf(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	*/
     
     @PostConstruct
     public void startupStuff() {
    	 System.out.println("\nstaring tennisCoach bean");
     }
     
     @PreDestroy
     public void endStuff() {
    	 System.out.println("\ndestroying tennisCoach bean");
     }
     
	
	@Override
	public String getDailyWorkout() {
		System.out.println("TennisCoach: getDailyWorkout");
		return " >>practice you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("TennisCoach: getDailyFortune");
		return fortuneService.getDailyFortune();
	}

}
