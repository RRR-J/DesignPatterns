package com.test.template;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Coffee.brew()");
	}

	@Override
	void pourInCup() {
		System.out.println("Coffee.pourInCup()");
	}

}
