package com.cg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(60);
        list1.add(70);
        System.out.println("--------for each loop-----");
        /// internally using iterator---------
        for(int a:list1) {
        	System.out.println(a);
        }
        System.out.println("-------while loop-------");
        //using iterator directly--------
        Iterator<Integer>it =  list1.iterator();
        while(it.hasNext()) {
        	int val =it.next();
        	System.out.println(val);
        }
        System.out.println("--iterating in-reverse by while loop---");
        ListIterator<Integer>it2=list1.listIterator(list1.size());
        while(it2.hasPrevious()) {
        	int val =it2.previous();
        	System.out.println(val);
        }
        System.out.println("--iterating in-reverse by  for each loop---");
        for(int i = list1.size()-1;i>=0;i--) {
        	int val=list1.get(i);
        	System.out.println(val);
        }
	}

}
