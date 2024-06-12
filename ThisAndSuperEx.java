package com.odigos.oops;

class ParentEx2 {
	final int marks = 230;

	public ParentEx2() {
		this("pavan");// 3
		System.out.println("am from parent class default constructor");// 5
	}

	public ParentEx2(String name) {
		System.out.println("am from parent class param constructor: " + name);// 4
	}

	public void displayMessage() {
		System.out.println("am from parent method");// 9
	}

}

public class ThisAndSuperEx extends ParentEx2 {

	int marks = 123;

	public ThisAndSuperEx() {
		// super();//2
		this(222);// 6
		System.out.println("am from default constructor");// 10

	}

	public ThisAndSuperEx(int marks) {
		System.out.println("am from param constructor" + marks + " " + this.marks + " " + super.marks);// 7
		this.displayMessage();
		super.displayMessage();
		System.out.println(this);
	}

	public static void m1(int marks) {
		System.out.println("marks...from method :" + marks);// 12
	}

	@Override
	public void displayMessage() {
		System.out.println("am from child overriden method");// 8
	}

	public static void main(String[] args) {
		ThisAndSuperEx obj = new ThisAndSuperEx();// 1
		ThisAndSuperEx.m1(111);// 11
		System.out.println(obj.toString());
	}
}
