package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollectionsEx {

	public static void main(String[] args) {
		ArrayList<Product> prodList = new ArrayList<Product>();
		Product p1 = new Product(1111, "Teddy Bear", 500, 4.4f);
		Product p2 = new Product(1112, "Samsung", 900, 4.5f);
		Product p3 = new Product(1113, "Alexa", 700, 4.6f);
		Product p4 = new Product(1141, "Apple", 800, 4.7f);
		Product p5 = new Product(1151, "Shoes", 19000, 4.8f);
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		for(Product p: prodList) {
			System.out.println(p);
		}
		
   Collections.sort(prodList);
   System.out.println("------SortingByPrice Low to High-----");
   for(Product p: prodList) {
		System.out.println(p);//internally to string
	}
   Collections.sort(prodList);
   
   for(Product p: prodList) {
		System.out.println(p);//internally to string
	}
   System.out.println("***********");
   Collections.sort(prodList, new SortByRatings()); ///object created by new
   System.out.println("------------SortingByPrice High to low----");
   for(Product p: prodList) {
		System.out.println(p);//internally to string
	}
   //Sort the product based on the product name
 Collections.sort(prodList , new SortByProductName());
 System.out.println("------------SortingByName ----");
   
   for(Product p: prodList) {
		System.out.println(p);//internally to string

}
}
}
 
