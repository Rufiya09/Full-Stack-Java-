package com.odigos.oops;
//method name is same implementation is different

class ParentEx {
	public void m1() {
		System.out.println("welcome to india");
	}

	public void m2() {
		System.out.println("welcome to kakinada");
	}

}

public class Method_Overriding_Ex extends ParentEx {

	public static void main(String[] args) {
		Method_Overriding_Ex obj = new Method_Overriding_Ex();
		obj.m1();
		obj.m2();
	}
	@Override
	public void m2() {
		System.out.println("welcome to Telangana");
	}
	public void m3() {
		System.out.println("welcome to Hyderabad");
	}

}
