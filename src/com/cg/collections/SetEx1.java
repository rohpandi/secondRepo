package com.cg.collections;

import java.util.HashSet;
//no duplicates

public class SetEx1 {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
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
