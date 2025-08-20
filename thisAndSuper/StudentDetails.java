package com.thisAndSuper;

import java.util.Scanner;

public class StudentDetails {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Student Details");
	System.out.println("enter the name of student");
	String name= sc.nextLine();
	System.out.println("Enter the age");
	int age= sc.nextInt();
	Student s= new Student(name,age);
	s.display();
}
}
