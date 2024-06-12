package com.odigos.java8;

interface Calculator {
	public abstract int add(int a, int b);

	public default void m1() {
		System.out.println("am from default method m1");
	}

	public static void m2() {
		System.out.println("am from static method m2");
	}
}

public class LambdaExpressionEx {

	public static void main(String[] args) {
		Calculator calci = (a, b) -> a + b;
		System.out.println(calci.add(12, 13));
	}

}
