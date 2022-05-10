package com.cg.assignmentalb;

public class Employee {
	private static int empId = 101;
	private String empFirstName;
	private String empLastName;
	private static double empSalary = 50000;
	private char empgrade;

	public Employee() {
		empId++;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empgrade=" + empgrade + ", empSalary=" + empSalary + "]";
	}

	public static int getEmpId() {
		return empId;
	}

	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public static double getEmpSalary() {
		return empSalary;
	}

	public static void setEmpSalary(double empSalary) {
		Employee.empSalary = empSalary;
	}

	public char getEmpgrade() {
		return empgrade;
	}

	public void setEmpgrade(char empgrade) {
		this.empgrade = empgrade;
	}

}
