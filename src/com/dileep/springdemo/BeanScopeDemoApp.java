package com.dileep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");  
		 
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check of above two are same
		boolean flag = (theCoach==alphaCoach);
		
		//pring out the results
		System.out.println("\npointing to the same object: " + flag);
		System.out.println("\nlocation of theCoach bean: " + theCoach);
		System.out.println("\nlocation of alphaCoach bean: " + alphaCoach);
	}
}
