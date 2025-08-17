package com.abstraction;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the salary");
	int salary= s.nextInt();
	
	FulltimeEmployee f= new FulltimeEmployee();
	f.calculateSalary(salary);
	
	System.out.println("Enter the salary");
	int salary1= s.nextInt();

	PartTimeEmployee p= new PartTimeEmployee();
	p.calculateSalary(salary1);
}
}
