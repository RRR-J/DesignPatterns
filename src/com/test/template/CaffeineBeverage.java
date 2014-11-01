package com.test.template;

public abstract class CaffeineBeverage {
	final void prepareReceipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	void boilWater() {
		System.out.println("CaffeineBeverage.boilWater()");
	}

	abstract  void brew();
	abstract void pourInCup() ;

	void addCondiments() {
		System.out.println("CaffeineBeverage.addCondiments()");		
	}
	
	

	
	
	
	
	

}
