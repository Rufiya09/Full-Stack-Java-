package com.odigos.exceptions;

import java.util.Scanner;

class AgeNotValid extends Exception {
	public AgeNotValid(String message) {
		super(message);
	}
}

public class Validation {

	public static void validate(int age) throws AgeNotValid {
		if (age < 18) {
			throw new AgeNotValid("invalid age to vote");
		} else {
			System.out.println("You are eligible to vote ");
		}
	}

	public static void main(String[] args) throws AgeNotValid {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = scan.nextInt();
		Validation.validate(age);
	}

}
