package com.odigos.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamApiEx1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		int count = 0;
		for (String str : names) {
			if (str.length() < 6)
				count++;
		}
		System.out.println("There are " + count + " strings with length less than 6");
	}
}