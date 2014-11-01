package com.test.singleton;

import org.junit.Test;

public class TestSingelton {

	@Test
	public void test() {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();

		assert (lazySingleton1 == lazySingleton2);
	}
}
