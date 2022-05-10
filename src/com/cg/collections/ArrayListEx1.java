package com.cg.collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		Sysyem.out.println("Rohan edited");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(60);
        list1.add(70);
        
        for(Integer i : list1) {
        	System.out.println(i);
        }
        System.out.println("--------------------");
        int x= list1.get(3);
        System.out.println(x);
        
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Rohan");
        list2.add("riya");
        list2.add("trdt");
        list2.add("Rodan");
        list2.add("siya");
        
        System.out.println("----------------");
        for(String s:list2) {
        	System.out.println(s);
        }
        System.out.println("----------------");
        String name=list2.get(0);
        System.out.println(name);
        
        System.out.println("---------AfterSorted------");
        
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list2);
        System.out.println(list2);
        
        
        
	}
}
