package com.odigos.basics;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// ctrl+shift+O

		System.out.println("Enter student id: ");
		int sid = scan.nextInt();
		System.out.println("Enter student name : ");
		String sname = scan.next();
		System.out.println("Enter student marks : ");
		float marks = scan.nextFloat();
		System.out.println("Enter student contact : ");
		long contact = scan.nextLong();

		System.out.println(sid + " " + sname + " " + marks + " " + contact);
		
		scan.close();

	}

}
