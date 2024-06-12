package com.odigos.exceptions;

import java.util.Scanner;

public class WIthOutExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);// ctrl+shift+o
			System.out.println("Enter first number for division: ");
			int fNum = scan.nextInt();
			System.out.println("Enter second number for division: ");
			int sNum = scan.nextInt();

			int division = fNum / sNum;// error code
			System.out.println("division of two numbers is :" + division);

		} catch (ArithmeticException ex) {
			System.out.println("Dont enter zero as denominator");// handling code
		} finally {
			System.out.println("am from finally will execute always");
			scan.close();
		}
		System.out.println("Remaining lines of code ....");

	}

}
