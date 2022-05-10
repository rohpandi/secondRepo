package com.cg.collections;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// vector provides dynamic array
		Vector<String> v1= new Vector<String>();
		System.out.println("Initial Capacity:" + v1.capacity());

		Vector<String> v2 = new Vector<String>(4,10);
		System.out.println("Initial Capacity:" + v2.capacity());
		v2.add("Bangalore");
		v2.add("Chennai");
		System.out.println(v2);
		System.out.println("No of Elemnents:" +v2.size());
		v2.add("Delhi");
		v2.add("Pune");
		v2.add("Mumbai");
		System.out.println("-------------");
		System.out.println(v2);
		System.out.println("No of Elemnents:" +v2.size());
		System.out.println("Final Capacity:" + v2.capacity());
		System.out.println("------FOR-------");
		
		for(String s:v2) {
			System.out.println(s);
		}
		v2.add(1,"Kolkata");
		System.out.println(v2);
		String city=v2.get(0);
		System.out.println(city);
		v2.remove("Pune");
		System.out.println(v2);
		
		boolean isPresent= v2.contains("Mumbai");
		System.out.println("isPresent");
		
	}

}
