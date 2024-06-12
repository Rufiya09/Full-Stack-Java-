package com.odigos.java8;

interface Calculator1 {
	public void add(int a, int b);
}

public class MethodReferenceTest {
	public void calci(int a, int b) {
		System.out.println("add of two numbers  :" + (a + b));
	}

	public static void calcisub(int a, int b) {
		System.out.println("sub of two numbers  :" + (a - b));
	}

	public static void main(String[] args) {
		MethodReferenceTest obj = new MethodReferenceTest();
		Calculator1 obj1 = obj::calci;
		obj1.add(12, 13);

		Calculator1 obj2 = MethodReferenceTest::calcisub;
		obj2.add(12, 13);

	}

}
