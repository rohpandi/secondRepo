package com.cg.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map1 = new LinkedHashMap<String,String>();
		map1.put("SBC", "Bangalore");
		map1.put("MMCT", "Mumbai Central");
		map1.put("BSB", "Varanasi");
		map1.put("MAS", "Chennai Central");
		System.out.println(map1);
		map1.put("SBC", "Bengaluru");//overwrites.....
		System.out.println(map1);
		String city=map1.get("BSB");
		System.out.println(city);


	}

}
