package com.odigos.basics;

public class ArrayEx3 {
	public static void main(String[] args) {
		int marks[] = { 12, 23, 43, 55, 63, 533, 53, 99, 89 };
		System.out.println(marks.length);
//		for (int i = 0; i < marks.length; i++) {
//				System.out.println(marks[i]);
//		}
		
		for(int i:marks)
		{
			System.out.println(i);
		}
		
		
	}
}
