package com.thisAndSuper;

public class Student {
	String name;
	int age;

public Student(String name, int age) {
	this.name= name;
	this.age=age;
}
public void display() {
	System.out.println("Name of the student is "+name);
	System.out.println("Age of the student is "+age);
}
}

