package com.cg.collections;

import java.util.Comparator;

public class SortByProductName implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getProdName().compareTo(p2.getProdName());
//		// TODO Auto-generated method stub
//		if (p1.getProdName().compareTo(p2.getProdName())>=1)
//			return 1;
//		else
//			return -1;
	}

}
