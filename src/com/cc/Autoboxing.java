package com.cc;

public class Autoboxing {
	public static void main(String[] args) {
		//prior to jdk1.5
	int a=9;
	Integer a1= new Integer(a);
	System.out.println(a);
	
	//From jdk1.5 autoboxing and autounboxing
	Integer a2=100; //autoboxing
	System.out.println(a2);
	Object obj1=a2;
	System.out.println(obj1);
	
	Object obj2=999;
	Object obj3="GOODMORnING";
	System.out.println(obj2);
	System.out.println(obj3);
	
	Integer a5=99;
	//prior to jdk1.5
	int v1=a5.intValue();//from object to datatype
	System.out.println(v1);
	
	//from jdk1.5
	int v2 =a5;//auto unboxing
	System.out.println(v2);
	

	}

}
