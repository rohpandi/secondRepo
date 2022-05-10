package com.revisInheritance;

public class Ex {

	public static void main(String[] args) {
		Person p1 = new Student(); //upCasting
        p1.info();
        
        
        
        p1 = new Person();
        p1.info();
        p1 = new Student();
//        p1.studInfo(); since p1 is the type of person, during the compilation time,compiler checks the method 
//        is available or not, if the method is not available compilation error will occur
        Student s =(Student)p1; //downCasting
        s.studinfo();
        
        
	}

}
