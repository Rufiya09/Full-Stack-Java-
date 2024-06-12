package com.odigos.oops;

interface Parent1 {
	public void m1();//abstract
}

interface Parent2 {
	public void m1();
}

public class MultipleInheritanceEx implements Parent1, Parent2 {

	public static void main(String[] args) {
		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from m1 method of MI class");
	}

}
