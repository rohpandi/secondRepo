package com.cg.collections;

import java.util.Vector;

public class IntegerEx {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		System.out.println("Initial Capacity:" + v1.capacity());
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println(v1);
		System.out.println("------FOR-------");
		for(Integer i:v1) {
			System.out.println(i);
        	
	}
	}

}
