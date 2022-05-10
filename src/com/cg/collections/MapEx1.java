package com.cg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("SBC", "Bangalore");
		map1.put("MMCT", "Mumbai Central");
		map1.put("BSB", "Varanasi");
		map1.put("MAS", "Chennai Central");
		System.out.println(map1);
		map1.put("SBC", "Bengaluru");// overwrites.....
		System.out.println(map1);
		String city = map1.get("MAS");
		System.out.println(city);

		boolean b = map1.containsKey("BSB");
		System.out.println(b);

		System.out.println("--iterating key");
		Set<String> keys = map1.keySet();
		for (String k : keys) {
			System.out.println(k);
		}

		System.out.println("----iterating value");
		Collection<String> values = map1.values();
		for (String v : values) {
			System.out.println(v);
		}
		Set<Entry<String, String>> rows = map1.entrySet();
		System.out.println("**************");
		System.out.println("Key -----------Value");
		for (Entry<String, String> row : rows) {
			String k = row.getKey();
			String v = row.getValue();
			System.out.println(k + "---------" + v);
		}

	}
}
