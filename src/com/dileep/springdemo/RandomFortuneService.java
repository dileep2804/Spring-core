package com.dileep.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	public RandomFortuneService() {
		System.out.println("RandomFortuneService: default constructor");
	}
	
	//create an array of strings
	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"hardwork beats luck",
			"the journey is the reward",
			"enjoy your work"
	};
	
	//create a random number generator
	private Random myRandom=new Random();
	
	
	@Override
	public String getDailyFortune() {
		System.out.println("RandomFortuneService: getDailyFortune");
		int ind= myRandom.nextInt(data.length);
		String theFortune = data[ind];
		
		return theFortune;
	}

}
