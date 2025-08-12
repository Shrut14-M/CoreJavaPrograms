package com.Eligibility;

//Using Constructor

public class Student {
	int marks;
	int rollNo;
public Student(int marks, int rollNo) {
	this.marks=marks;
	this.rollNo = rollNo;
	System.out.println("marks : "+ marks);
	System.out.println("rollNo : "+ rollNo);
}


public int getMarks() {
return marks;
}
}
