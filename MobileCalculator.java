package com.odigos.oops;

class Calculator {
	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}
}

class PcCalculator extends Calculator {
	public void mod(int a, int b) {
		System.out.println("mod of two numbers : " + (a % b));
	}
}

public class MobileCalculator extends PcCalculator {

	public void div(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));
	}

	public static void main(String[] args) {
		MobileCalculator calci = new MobileCalculator();
		calci.div(12, 3);
		calci.add(12, 23);
		calci.sub(23, 2);
		calci.mul(12, 2);
		//calci.mod(32, 4);
	}

}
