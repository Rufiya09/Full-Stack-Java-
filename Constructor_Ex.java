package com.odigos.oops;

import java.util.Date;

public class Constructor_Ex {
	
	public Constructor_Ex()
	{
		System.out.println("default constructor");
	}
	public Constructor_Ex(String name)
	{
		System.out.println("param constructor :"+name);
	}
	

	public void printDate() {
		System.out.println("Today's Date : " + new Date());
	}

	public static void main(String[] args) {

		Constructor_Ex obj = new Constructor_Ex("we are getting sleep");//jvm will add default constructor 
		obj.printDate();
	}

}
