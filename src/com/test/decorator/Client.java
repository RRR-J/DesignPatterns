package com.test.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IceCream iceCream = new ChocolateIceCreamDecorator(new SimpleIceCream());
		System.out.println("Client.main()" + iceCream.makeIceCream());
	}

}
