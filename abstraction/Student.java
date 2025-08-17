package com.abstraction;

public class Student extends Person {

	@Override
	public void displayDetails(String Name, String Sirname, int age, String Department) {
		System.out.println("Name of the Student is " + Name);
		System.out.println("Sirname of the Student is " + Sirname);
		System.out.println("Age of the Student is " + age);
		System.out.println("Department of the Student is " + Department);

	}

}
