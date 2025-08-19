package com.encapsul;

public class Student {
public static void main(String[] args) {
	StudentDetails s= new StudentDetails();
	s.setStudentid(26);
	System.out.println("Student Id is " +s.getStudentid());
	
	s.setStudentName("bhavana");
	System.out.println("Name of the student is "+ s.getStudentName());
	
	s.setStandard("10th");
	System.out.println(s.getStudentName()+ " is in the standard " + s.getStandard());
	
	s.setPercentage(92);
	System.out.println("Percentage obtained to " + s.getStudentName()+ " is " + s.getPercentage());
	}
}
