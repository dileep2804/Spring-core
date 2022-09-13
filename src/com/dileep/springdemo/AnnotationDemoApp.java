package com.dileep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
	//read config file
	ClassPathXmlApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve the bean from spring container
	Coach myCoach=context.getBean("tennisCoach", Coach.class);
		

	//call a method to bean
	System.out.println(myCoach.getDailyWorkout());
	System.out.println(myCoach.getDailyFortune());

	//close the context
	context.close();
	}
}
