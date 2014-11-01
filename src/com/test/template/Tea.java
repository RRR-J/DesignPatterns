package com.test.template;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Tea.brew()");
	}

	@Override
	void pourInCup() {
		System.out.println("Tea.pourInCup()");
	}

}
