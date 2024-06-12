package com.odigos.oops;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Username :");
		String uname = scan.next();
		System.out.println("Enter Your Password :");
		String pass = scan.next();

		if (uname.equals("odigos") && pass.equals("odigoskakinada"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failure");

		scan.close();

	}

}
