package com.test.singleton;

public class EagerSingleton {

	private static EagerSingleton singleInstance = new EagerSingleton();
	
	private EagerSingleton(){
	}
	
	public static EagerSingleton getInstance(){
			return singleInstance;
	}
	
}
