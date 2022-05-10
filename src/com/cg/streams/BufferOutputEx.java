package com.cg.streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputEx {

	public static void main(String[] args) {
		
		FileOutputStream fo = null;
		BufferedOutputStream buffer = null;
		try {
			fo = new FileOutputStream("/javahybris/data.txt");
		
		//BufferedOutputStream buffer = new BufferedOutputStream(fo,4);
			
		buffer = new BufferedOutputStream(fo);
		buffer.write('A');
		buffer.write('B');
		buffer.write('C');
		buffer.write('D');
		buffer.write('E');
		System.out.println(5/0);
		buffer.write('F');
		buffer.write('G');
    	//buffer.close();
		//buffer.flush();
		System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
