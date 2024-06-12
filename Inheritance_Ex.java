package com.ot9.basics;

class ParentEx {
	int marks = 123;

	public void m3() {
		System.out.println("am from m3 method");
	}
}

public class Inheritance_Ex extends ParentEx {

	public void m1() {
		System.out.println("am from m1 method");
	}

	public void m2() {
		System.out.println("am from m2 method");
	}

	public static void main(String[] args) {
		Inheritance_Ex obj = new Inheritance_Ex();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(obj.marks);
	}

}
