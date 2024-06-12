package com.odigos.basics;

public class Methods_Example {
	int marks = 123;  // global variable and instance variable
	static String schoolName = "xyz";//global and static variable

	public void displayMsg() { // default method with no return type and instance
		System.out.println("welcome to india");
	}

	public void addOfTwo(int a, int b) { // param method with no return type and instance
		System.out.println("Addition of two numbers :" + (a + b));
	}

	public static int subOfTwo(int a, int b) { // param method with int return type and static
		return a - b;
	}

	public String message() { // default method with return type and instance
		return "am from methods example...";
	}

	public static void main(String[] args) {

		System.out.println(Methods_Example.subOfTwo(12, 13));//static method calling using classname
		System.out.println(Methods_Example.schoolName);//accessing static variable by using classname
		Methods_Example obj = new Methods_Example();//object creation for instance properties memory
		System.out.println(obj.message());//instance method calling using object reference
		obj.addOfTwo(12, 14);
		System.out.println(obj.marks);//instance variable access by using object reference

	}
}
