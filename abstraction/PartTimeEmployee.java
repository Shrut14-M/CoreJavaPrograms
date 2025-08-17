package com.abstraction;

public class PartTimeEmployee extends Employee {

	@Override
	public void calculateSalary(int salary) {
		if(salary<50000) {
			System.out.println("The employee is part time employee");
		}
		else {
			System.out.println("The employee is not a part time employee");
		}
	}

}
