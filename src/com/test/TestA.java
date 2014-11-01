package com.test;

import java.util.TreeMap;

public class TestA implements Comparable<TestA> {

	private String name = "n";

	public static void main(String[] args) {
		new TestA().run();
	}

	@Override
	public int compareTo(TestA o) {
		System.out.println("TestA.compareTo()");
		if (o.name.equals(name)) {
			return 0;
		} else {
			return -1;
		}
	}

	public void run() {
		TestA test1 = new TestA();
		TestA test2 = new TestA();
		test2.name = "m";
		TreeMap<TestA, String> map = new TreeMap<TestA, String>();
		map.put(test1, "value1");
		map.put(test2, "value2");
		System.out.println(map.size());
	}
}
