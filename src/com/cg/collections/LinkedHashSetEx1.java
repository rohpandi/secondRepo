package com.cg.collections;

import java.util.LinkedHashSet;
// no duplicates and sorting is done in the insertion order


public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("Virat");
		 boolean b1=set1.add("Jerry");
		set1.add("Tom");
		boolean b2=set1.add("Jerry");
		set1.add("Harry");
		set1.add("Potter");
		System.out.println(set1);
		System.out.println(b1+" "+b2);
			

	}

}
