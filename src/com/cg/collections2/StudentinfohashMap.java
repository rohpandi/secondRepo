package com.cg.collections2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentinfohashMap {
	
	public static void main(String[] args) {
		HashMap<Student,MarkSheet> map= new HashMap<>();
		map.put(new Student(101,"A","X") , new MarkSheet(90,80,77));
		map.put(new Student(102,"B","XI") , new MarkSheet(95,85,67));
		map.put(new Student(103,"C","IX") , new MarkSheet(80,60,67));
		map.put(new Student(104,"D","XII") , new MarkSheet(70,70,87));
		map.put(new Student(101,"A","X") , new MarkSheet(90,80,77));
		System.out.println("key  values");
		Set<Entry<Student,MarkSheet>> rows = map.entrySet();
		for(Entry<Student,MarkSheet>row : rows) {
			Student k = row.getKey();
			MarkSheet v = row.getValue();
			System.out.println(k+"-------"+v);
		}
	}

}
