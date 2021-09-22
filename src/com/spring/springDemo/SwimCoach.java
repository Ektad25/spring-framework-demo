package com.spring.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private Fortune fortuneService;
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(Fortune theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
}
