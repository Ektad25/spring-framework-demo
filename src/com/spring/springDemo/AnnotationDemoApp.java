package com.spring.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext cfg=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean 
		Coach theCoach=cfg.getBean("tennisCoach",Coach.class);
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		cfg.close();
	}

}
