package com.odigos.basics;

public class ArraysEx {
	public static void main(String[] args) {

		int marks[] = { 12, 23, 43, 55, 63, 533, 53, 99, 89 };

//		marks[2]=999;
//		System.out.println(marks[0]);
//		System.out.println(marks[12]);

		System.out.println(marks.length);

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 != 0)
				System.out.println(marks[i]);
		}

		int array[] = new int[10];
		System.out.println("storing the values into an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println("Iterating an array");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
