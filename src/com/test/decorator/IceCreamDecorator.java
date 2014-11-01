package com.test.decorator;

public abstract class IceCreamDecorator implements IceCream {
	
	protected IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String makeIceCream() {
		return iceCream.makeIceCream() ;
	}

}
