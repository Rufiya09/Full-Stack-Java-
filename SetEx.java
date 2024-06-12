package com.odigos.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//1)collections can hold/store  homogeneous/similar and heterogeneous data 
//2)collection are not fixed in size , growable in nature  -->AL-->10-->16-->25 (cc*3/2)+1
//3)lots of utility methods
//1)duplicates are not allowed
//2)insertion order not followed/preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new ReverseOrder());// 16//Comparable-->NSO--->compareTo

		set.add("hitesh"); // Comparator--->CSO-->compare
		set.add("suresh");
		set.add("naresh");
		set.add("rajesh");
		set.add("somesh");
		set.add("hitesh");
		set.add("akash");
		set.add("chethan");

		System.out.println(set);// natural order--->A-z,1,2,3,4....

		System.out.println("adigos".compareTo("odigos"));// 0

//		compareTo 
//		--return -ve if obj1 has to come before obj2
//		--return +ve if obj1 has to come after obj2
//		-- return 0 if obj1 & obj2 are equal.

//		Iterator<String> itr = set.iterator();
//
//		while (itr.hasNext()) {
//			String ename=itr.next();
//			if(ename.endsWith("esh"))
//				System.out.println(ename);
//		}

	}
}
class ReverseOrder implements Comparator<String> 
{

	@Override
	public int compare(String obj1, String obj2) {
		
		//return -obj1.compareTo(obj2);
		
		return obj2.compareTo(obj1);
	}
	

}
