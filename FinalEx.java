package com.odigos.oops;

class ParentEx1 {//final
	 int age = 30;//final

	public void display_Msg() {
		System.out.println("am from parentex1 method ");
	}

	public  void printAge() {//final
		++age;
		System.out.println("Your Age is : " + age);
	}

}

public class FinalEx extends ParentEx1 {
	@Override
	public void printAge() {
		--age;
		System.out.println("Your Age is : " + age);
	}

	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
			obj.display_Msg();
			obj.printAge();
	}

}
