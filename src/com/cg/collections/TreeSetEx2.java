package com.cg.collections;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		
		///natural order
		TreeSet<Student> set = new TreeSet<Student>();
		Student s1 = new Student (11,"Roha","English");
		Student s2 = new Student (12,"Ruyey","Hindi");
		Student s3 = new Student (13,"Roham","Math");
		Student s4 = new Student (11,"Roha","English");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		for( Student s: set)
			System.out.println(s);
	}
}
