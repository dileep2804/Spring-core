package com.dileep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach theCoach=context.getBean("myCoach",Coach.class);
//		Coach trackCoach=context.getBean("trackCoach",Coach.class);
		
		CricketCoach cricketCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//call methods on the bean 
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
//		
//		System.out.println(trackCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeamName());
		
		//close the context
		context.close();

	}

}
