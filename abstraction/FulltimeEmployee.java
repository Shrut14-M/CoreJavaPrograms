package com.abstraction;

public class FulltimeEmployee extends Employee{

	@Override
	public void calculateSalary(int salary) {
    if(salary>=50000)	{
    	System.out.println("The employee is a Fulltime Employee");
    }
    else {
		System.out.println("The employee is not a full time employee");
	}
	}

}
