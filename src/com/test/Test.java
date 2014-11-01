package com.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test extends AbstractC {

	public Test() {
		System.out.println("Test.Test()");
	}

	@Override
	public void testC() {
		System.out.println("Test.testC()");
	}

	public void testC2() {
		System.out.println("AbstractC.testC()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		doIt(a);
	}

	public void testMe() throws Exception {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("Test.testMe()");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Test.testMe() iiiii");
		}
	}

	public static void doIt(List<String> l) {

	}

}
