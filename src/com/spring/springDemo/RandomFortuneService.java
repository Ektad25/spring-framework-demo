package com.spring.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements Fortune {

	// create an array of strings
	private String[] data = { "Beaware", "confident", "energetic" };
	
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		// pick a random string from array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		System.out.println(theFortune);
		return theFortune;
	}

}
