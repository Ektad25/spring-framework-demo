package com.spring.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext cfg=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach= cfg.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach= cfg.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result=(theCoach==alphaCoach);
		
		//print result
		System.out.println("pointing to same "+result);
		System.out.println("address for thecaoch "+theCoach);
		System.out.println("address for thecaoch "+alphaCoach);
		
		//close context
		cfg.close();
		
	}

}
