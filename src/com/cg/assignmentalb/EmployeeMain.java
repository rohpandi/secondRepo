package com.cg.assignmentalb;

public class EmployeeMain {

	public static void main(String[] args) {

		// Creating 1st object
		Employee e1 = new Employee();

		// passing data using setter method
		e1.setEmpFirstName("Daniel");
		e1.setEmpLastName("Ahuja");
		e1.setEmpgrade('A');

		// Displaying the data using getter method
		System.out.println(e1.getEmpId() + " " + e1.getEmpFirstName() + " " + e1.getEmpLastName() + " "
				+ e1.getEmpSalary() + " " + e1.getEmpgrade());

		// Displaying the data using toString method
		System.out.println(e1);

		// Creating 2nd Object
		Employee e2 = new Employee();

		// passing data using setter method
		e2.setEmpFirstName("Samuel");
		e2.setEmpLastName("Chatterjee");
		e2.setEmpgrade('B');

		// Displaying the data using getter method
		System.out.println(e2.getEmpId() + " " + e2.getEmpFirstName() + " " + e2.getEmpLastName() + " "
				+ e2.getEmpSalary() + " " + e2.getEmpgrade());

		// Displaying the data using toString method
		System.out.println(e2);
	}
}