package com.odigos.oops;

interface Parent_Calci {// abstraction-->100%
	public abstract void div(int a, int b);

	void mod(int a, int b);// public abstract void mod(int a,int b);
}

abstract class Laptop_Calci implements Parent_Calci {
	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public abstract void sub(int a, int b);

}

public class AbstractionEx extends Laptop_Calci {

	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}

	public static void main(String[] args) {
		AbstractionEx obj = new AbstractionEx();
		obj.add(12, 13);
		obj.sub(120, 2);
		obj.mul(11, 12);
		obj.div(12, 3);
		obj.mod(20, 5);

	}

	@Override
	public void sub(int a, int b) {
		System.out.println("sub of two numbers " + (a + b));

	}

	@Override
	public void div(int a, int b) {
		System.out.println(a / b);
	}

	@Override
	public void mod(int a, int b) {
		System.out.println(a % b);
	}

}
