package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class printoutput {

	public static void main(String[] args) {
		
		try {
			PrintStream p= new PrintStream(new FileOutputStream("/javahybris/helloo.txt"));
			
			p.println("Apple");
			p.println("Mango");
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
        
	}

}
