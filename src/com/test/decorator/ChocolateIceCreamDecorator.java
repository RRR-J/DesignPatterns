package com.test.decorator;

public class ChocolateIceCreamDecorator extends IceCreamDecorator {
	
	public ChocolateIceCreamDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public String makeIceCream() {
		return iceCream.makeIceCream() + "chocolate";
	}
	
}
