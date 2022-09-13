package com.dileep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		 
		//read spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		//check if above beans are same
		boolean flag=(myCoach==alphaCoach);
		
		System.out.println("\nPointing to the same object: "+ flag);
		System.out.println("\nMemory location of myCoach: " + myCoach);
		System.out.println("\nMemory location of alphaCoach; " + alphaCoach);
		
		//call a method to form specified bean
		
		
		//close the context
		context.close();
	}

}
