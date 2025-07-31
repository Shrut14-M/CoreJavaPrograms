package com.constructor;

public class EmployeeDetails {

	public EmployeeDetails(int empId, String Name, String salary) {
		System.out.println(empId);
		System.out.println(Name);

		System.out.println(salary);

	}

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails(4, "Ashish", "4LPA");
		System.out.println("     ");

		EmployeeDetails e1 = new EmployeeDetails(7, "Shruti", "12LPA");
		System.out.println("     ");

		EmployeeDetails e2 = new EmployeeDetails(9, "Devika", "5LPA");

	}
}
