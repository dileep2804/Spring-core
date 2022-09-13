package com.dileep.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read java config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve beans from config file
		Coach myCoach = context.getBean("swimCoach", Coach.class);
		SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);  
		
		//check if both are same
		System.out.println(myCoach==mySwimCoach);  //yes they are 
		
		//call a method to the created bean
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(mySwimCoach.getEmail());
		
		//close the context
		context.close();
	}

}
