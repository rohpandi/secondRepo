package com.cg.collections;

import java.util.Comparator;

public class SortByRatings implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if (p1.getRatings() < p2.getRatings())
			return 1;
		else
			return -1;
	}
	

}

	