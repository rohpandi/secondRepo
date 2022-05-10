package com.cg.collections;

import java.util.TreeSet;
//no duplicates the sorting is done by alphabetically
public class TreeSetEX1 {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<String>();
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
