package com.dileep.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read java config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve beans from config file
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method to the created bean
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
