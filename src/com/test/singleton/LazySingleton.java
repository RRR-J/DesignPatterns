package com.test.singleton;

public class LazySingleton {

	private static LazySingleton singleInstance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (singleInstance == null) {
			singleInstance = new LazySingleton();
		}
		return singleInstance;
	}

}
