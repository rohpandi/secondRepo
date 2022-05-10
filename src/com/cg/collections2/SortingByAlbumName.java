package com.cg.collections2;

import java.util.Comparator;

public class SortingByAlbumName implements Comparator<Album> {

	@Override
	public int compare(Album a1, Album a2) {
		return a1.getAlbumName().compareTo(a2.getAlbumName());
	}

}
