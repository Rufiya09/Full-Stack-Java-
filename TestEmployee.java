package com.odigos.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos = new FileOutputStream("employees.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//		Employee emp = new Employee(123, "odigos", 23000);
//		oos.writeObject(emp);
//		System.out.println("emp saved successfully");

		FileInputStream fos = new FileInputStream("employees.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);

		Employee emp = (Employee) oos.readObject();
		System.out.println(emp);
	}

}
