package com.cc;

public class InstanceOfEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		print(dog);
		System.out.println("----------");
		Cat cat = new Cat();
		print(cat);

	}
	static void print(Animal animal) {
		animal.walk();
		
		if(animal instanceof Dog) {
			Dog dog =(Dog)animal;
			dog.barks();
		}
		else if(animal instanceof Cat) {
			Cat cat =(Cat)animal;
			cat.mew();
		}
		
	}
	

}
