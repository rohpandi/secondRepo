package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args)  {
		try {
			FileOutputStream fo = new FileOutputStream("/javahybris/hello.txt");
			
			//true is used for appending
			fo.write('L');
			fo.write('B');
			fo.write('C');
			fo.write('D');
			System.out.println("DONE....");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		} 

	}

}
