package com.odigos.oops;

public class StringExample {

	public static void main(String[] args) {
		// Immutable
		String name = "odigos";// literal -->heap--->SCP--->duplicates are not allowed
		String name1 = "odigos";
		String name2 = "Odigos";
		System.out.println(name.equals(name1));// value comparison true
		System.out.println(name1 == name2);// false
		System.out.println(name2.equals(name1));// value comparison false
		System.out.println(name2.equalsIgnoreCase(name1));// value comparison true
		System.out.println(name.compareTo(name1));// 0
		System.out.println("adigos".compareTo("aeigos"));// 97 98 -1
		System.out.println("odigos".compareToIgnoreCase("Odigos"));// 97 98 -1 A-65
		System.out.println("odigos".codePointAt(1));// ,a-97 A-65
		System.out.println("adigos".codePointBefore(1));// ,a-97
		System.out.println("odigos kakinada".toUpperCase());
		System.out.println("odigos kakinada".charAt(4));
		System.out.println("welcome to india".length());
		System.out.println("odigods".indexOf('d'));
		System.out.println("odigods".lastIndexOf('d'));
		
		
		
		
		

//		compareTo s
//		--return -ve if obj1 has to come before obj2
//		--return +ve if obj1 has to come after obj2
//		-- return 0 if obj1 & obj2 are equal.

//		System.out.println(name.concat(" kakinada"));// odigos kakinada--GC
//		System.out.println(name);
//		StringBuilder sb = new StringBuilder("kakinada");// mutable
//		sb.append(" india");
//		System.out.println(sb);

	}

}
