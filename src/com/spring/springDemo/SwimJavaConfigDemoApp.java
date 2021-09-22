package com.spring.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext cfg=new AnnotationConfigApplicationContext(SportConfig.class);
		//get bean 
		SwimCoach theCoach=cfg.getBean("swimCoach",SwimCoach.class);
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//call our new methods:
		System.out.println("email :"+theCoach.getEmail());
		System.out.println("team :"+theCoach.getTeam());
		//close the context
		cfg.close();
	}

}
