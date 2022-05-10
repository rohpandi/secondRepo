package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyReadWrite {
	

	public static void main(String[] args) {
		try {
			FileInputStream fii= new FileInputStream("/javahybris/hello.txt");
			FileOutputStream fc = new FileOutputStream("/javahybris/saco.txt");
			System.out.println("copied");
			int c;
			while((c=fii.read())!=-1)
				fc.write((char)c);
			    fii.close();
			    fc.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
