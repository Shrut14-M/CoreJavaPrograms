package com.abstraction;

public class Teacher extends Person{

	@Override
	public void displayDetails(String Name, String Sirname, int age, String Department) {
		System.out.println("Name of the Teacher is "+Name);	
		System.out.println("Sirname of the Teacher is "+Sirname);		
		System.out.println("Age of the Teacher is "+age);	
		System.out.println("Department of the Teacher in teaching "+Department);		

	}

}
