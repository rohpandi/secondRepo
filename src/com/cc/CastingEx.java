package com.cc;

public class CastingEx {

	public static void main(String[] args) {
		Animal a1 =new Dog();
		a1.walk();
		//Dog a2=a1; Compilation error
		Dog a2 =(Dog)a1;
		a2.barks();
		a1=new Cat();
		Cat a3=(Cat)a1;
		a3.mew();
		
		
		Dog a4 =(Dog)a1; //ClassCastException
		a4.barks();
		

	}

}
class Animal{
	void walk() {
		System.out.println("Animal is walking");
	}
}

class Dog extends Animal{
	void walk() {
		System.out.println("Dog is walking");
	}
	void barks() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal{
	void walk() {
		System.out.println("Cat is walking");
	}
	void mew() {
		System.out.println("cat mew");
	}
}
