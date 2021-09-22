package com.spring.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private Fortune fortune;
	
	//constructor
	public TennisCoach() {
		System.out.println("inside the constructor");
	}
	//define init method
	@PostConstruct
	public void initMethod()
	{
		System.out.println("Init method");
	}
	
//	define init method
	@PreDestroy
	public void destroyMethod()
	{
		System.out.println("Destroy method");
	}
	@Override
	public String getDailyWorkout() {
		//
		return "practice your volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "inside fortune";
	}

}
