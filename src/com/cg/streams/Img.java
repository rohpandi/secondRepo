package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Img {

	public static void main(String[] args) {
		FileInputStream io = null;
		FileOutputStream op = null;
		
		try {
			io= new FileInputStream("D:\\javahybris\\traditional layer.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			op = new FileOutputStream("D:\\javahybris\\newc.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ci=0;
		try {
			while((ci=io.read())!=-1) {
				op.write((char)ci);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("image copy");
		
	}
	

}
