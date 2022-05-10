package com.cg.collections;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Product> v1 = new Vector<Product>();
		Product p1 = new Product(1111, "Teddy Bear", 500, 4.4f);
		Product p2 = new Product(1111, "Samsung", 600, 4.5f);
		Product p3 = new Product(1111, "Alexa", 700, 4.6f);
		Product p4 = new Product(1111, "Apple", 800, 4.7f);
		Product p5 = new Product(1111, "Shoes", 19000, 4.8f);
		v1.add(p1);
		v1.add(p2);
		v1.add(p3);
		v1.add(p4);
		v1.add(p5);
		for(Product p: v1) {
			System.out.println(p);
		}
//     	System.out.println(p.getProdCode()+);
		
		
	}

		

}

