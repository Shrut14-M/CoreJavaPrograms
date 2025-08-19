package com.encapsul;

public class Employee {
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.setEmpId(12);
		e.setEmpName("Akshata");
		System.out.println("The Employee id of "+ e.getEmpName()+" is " + e.getEmpId());

		
		System.out.println("The Employee Name is " + e.getEmpName());

		e.setSalary(5000);
		System.out.println("Salary of  "+e.getEmpName() + " is " +e.getSalary()+ "rs");
		
		e.setDepartment("Management");
		System.out.println("Department of "+e.getEmpName()+ " is " + e.getDepartment());

		
	}
}
