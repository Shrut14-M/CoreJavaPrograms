package com.combinedQuestions;

public class Student {
int studentId;
String studentName;
String  course;
int year;
int percentage;

public Student(int studentId, String studentName, String course,int year,int percentage) {
	this.studentId= studentId;
	this.studentName= studentName;
	this.course=course;
	this.year=year;
	this.percentage= percentage;
	
}

public void m1() {
	System.out.println("Student id "+this.studentId);
	System.out.println("Student id "+this.studentName);
	System.out.println("Student id "+this.course);
	System.out.println("Student id "+this.year);
	System.out.println("Student id "+this.percentage);
	
}
public void CalculateGrade() {
	
	
	if(percentage>=90 && percentage<=100) {
		System.out.println("The Grade is A" );
	}
		else if(percentage>=80 && percentage<=90) {
			System.out.println("The grade is B");
		}
			else if(percentage>=70 && percentage<=80) {
				System.out.println("The grade is C");
			}
				else if(percentage>=60 && percentage<=70) {
					System.out.println("The grade is D");
				}
					else if(percentage>=50 && percentage<=60) {
					System.out.println("The grade is E");
					}
					else if (percentage>=40 && percentage<=50) {
						System.out.println("The grade is F");
								}
					else{
						System.out.println("Fail");
					}
							
			}

	
}

 

