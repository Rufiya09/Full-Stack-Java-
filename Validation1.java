package com.odigos.exceptions;

import java.util.Scanner;

public class Validation1 {

	public static void main(String[] args) throws InvalidCredentials {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter username");
		String username = scan.next();
		System.out.println("Enter passwrd");
		String password = scan.next();
		
		if(username.equals("odigos")&& password.equals("odigos123"))
		{
			System.out.println("LOGIN SUCCESS");
		}
		else
		{
			throw new InvalidCredentials("Invalid Login Details");
		}
		
	}

}
