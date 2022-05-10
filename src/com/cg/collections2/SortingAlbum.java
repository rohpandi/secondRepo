package com.cg.collections2;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAlbum {

	public static void main(String[] args) {
		ArrayList<Album> albList = new ArrayList<Album>();
		Album a1 = new Album(11," Slim Shady","Dre",1999, 14.40f);
		Album a2 = new Album(12,"Encore","Snoop",2004, 16.30f);
		Album a3 = new Album(13,"Marshal Mathers","Revoic",2000, 19.50f);
		Album a4 = new Album(14,"Kamikaze","Simulox",2018, 24.80f);
		Album a5 = new Album(15,"Recovery","anoxmoux",2010, 26.60f);
		Album a6 = new Album(16,"Revival","Bharg",2017, 36.60f);
		Album a7 = new Album(17,"Relapse","Dre",2009, 39.60f);
		albList.add(a1);
		albList.add(a2);
		albList.add(a3);
		albList.add(a4);
		albList.add(a5);
		albList.add(a6);
		albList.add(a7);
		for(Album alb: albList) {
			System.out.println(alb);
		}
		
		Collections.sort(albList);
		System.out.println("-- year_of_release_old_to_new--");
		for(Album alb: albList) {
			System.out.println(alb);
		}

		Collections.sort(albList, new SortingByAlbumName());
		System.out.println("--Sortingby_album_name");
		for(Album alb: albList) {
			System.out.println(alb);
		}
		
	}

}
