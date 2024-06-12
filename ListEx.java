package com.odigos.collections;

import java.util.ArrayList;
import java.util.Iterator;

//1)collections can hold/store  homogeneous/similar and heterogeneous data 
//2)collection are not fixed in size , growable in nature  -->AL-->10-->16-->25 (cc*3/2)+1
//3)lots of utility methods
//1)duplicates are allowed
//2)insertion order followed/preserved 

//java.util
public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// 10

		list.add("suresh");
		list.add("naresh");
		list.add("rajesh");
		list.add("somesh");
		list.add("hitesh");
		list.add("suresh");
		// list.add(123);
		list.add(0,"nihasvi");

		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

//		ArrayList list1 = new ArrayList();// 10
//
//		list1.add("sandeep");
//		list1.add(false);
//		list1.add(123);
//		list1.add(23.45f);
//		list1.add('a');
//		list1.add("sandeep");
//		System.out.println(list1);
//		list1.addAll(list);
//		System.out.println(list1);
//		list1.remove("sandeep");
//		System.out.println(list1);
//		list1.retainAll(list);
//		System.out.println(list1);
//		list1.clear();
//		System.out.println(list1);
//		System.out.println(list.contains("suresh"));
//		System.out.println(list.size());
		
		
		
		
	}

}
