package com.spring.springDemo;

public class SadFortuneService implements Fortune {

	@Override
	public String getFortune() {
			return "today is a sad day";
	}

}
