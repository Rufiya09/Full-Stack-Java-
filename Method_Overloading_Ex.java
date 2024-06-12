package com.odigos.oops;

public class Method_Overloading_Ex {

	public void add(float a, float b) {
		System.out.println("add of two float's :" + (a + b));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("add of three int's  :" + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("add of two int,float :" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of two float,int :" + (a + b));
	}

	public static void main(String[] args) {
		Method_Overloading_Ex obj = new Method_Overloading_Ex();
		obj.add(12, 13);
		obj.add(12.3f, 34.5f);
		obj.add(12, 13, 14);
		obj.add(12, 32.2f);
		obj.add(321.2f, 89);
		obj.add('a', 'b'); // type promotion
		obj.add(23.2f, 87.4f);
	}

}
