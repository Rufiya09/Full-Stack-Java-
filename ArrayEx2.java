package com.odigos.basics;

public class ArrayEx2 {

	public static void main(String[] args) {
		int a[][] = { { 22, 54, 65, 12 }, { 90, 12, 44, 55 } };
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i + "" + j);
				// System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
