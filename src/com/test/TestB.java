package com.test;

import java.util.HashMap;

public class TestB {

	private int id;
	private String name;

	public TestB(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestB other = (TestB) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public TestB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new TestB().run();
	}

	public void run() {
		TestB test1 = new TestB("m", 1);
		TestB test2 = new TestB("m", 1);
		TestB test3 = new TestB("m", 1);
		HashMap<TestB, String> map = new HashMap<TestB, String>();
		map.put(test1, "value1");
		map.put(test2, "value2");

		System.out.println(map.size());
		System.out.println(map.get(test1));
		System.out.println(map.get(test3));
	}
}
