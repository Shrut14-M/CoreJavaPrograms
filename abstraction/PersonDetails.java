package com.abstraction;

import java.util.Scanner;

public class PersonDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student Name");
		String name = sc.nextLine();

		System.out.println("Enter the Sirname");
		String Sirname = sc.nextLine();

		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Department");
		String Department = sc.nextLine();

		System.out.println("Display details of Student");
		Student s = new Student();
		s.displayDetails(name, Sirname, age, Department);
		
		System.out.println();
		
		System.out.println("Enter the Teacher Name");
		String name1 = sc.nextLine();

		System.out.println("Enter the Sirname of teacher");
		String Sirname1 = sc.nextLine();

		System.out.println("Enter the age of teacher");
		int age1 = sc.nextInt();

		System.out.println("Enter the Department of teacher");
		String Department1 = sc.nextLine();


		System.out.println("Display details of Teacher");
		Teacher t = new Teacher();
		t.displayDetails(name1, Sirname1, age1, Department1);
	}
}
