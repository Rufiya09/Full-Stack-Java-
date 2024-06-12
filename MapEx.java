package com.odigos.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//1)collections can hold/store  homogeneous/similar and heterogeneous data 
//2)collection are not fixed in size , growable in nature  -->AL-->10-->16-->25 (cc*3/2)+1
//3)lots of utility methods
//1)duplicate keys  are not allowed and values can be duplicate
//2)insertion order is not followed/preserved 

public class MapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> emps = new HashMap<Integer, String>();// 16
		emps.put(111, "suresh");
		emps.put(2231, "somesh");
		emps.put(431, "rajesh");
		emps.put(666, "naresh");
		emps.put(212, "prasanna");
		emps.put(21, "pavan");
		emps.put(8, "charan");
		emps.put(111, "sandeep");
		System.out.println(emps);

		Set<Integer> set = emps.keySet();

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "      " + emps.get(key));
		}
System.out.println("*********************************");
		Set<Entry<Integer, String>> entries = emps.entrySet();

		Iterator<Entry<Integer, String>> itr1 = entries.iterator();

		while (itr1.hasNext()) {
			Entry<Integer,String> entry = itr1.next();
			System.out.println(entry.getKey() + "      " + entry.getValue());
		}

//		emps.clear();
//		System.out.println(emps.isEmpty());
//		System.out.println(emps.size());
//		System.out.println(emps.containsKey(123));
//		System.out.println(emps.containsValue("prasanna"));
//		System.out.println(emps.get(111));
//		System.out.println(emps.remove(111));
//		System.out.println(emps);
//		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();// 16
//		emps1.put(333, "varsha");
//		emps1.put(555, "sekhar");
//		emps1.put(666, "krishna");
//
//		System.out.println(emps1);
//		emps1.putAll(emps);
//		System.out.println(emps1);
	}

}
