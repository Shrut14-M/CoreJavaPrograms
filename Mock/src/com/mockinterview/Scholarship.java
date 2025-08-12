package com.mockinterview;

public class Scholarship {
 public void scholarship(Student s) {
	 if(s.getMarks() > 90) {
		 System.out.println("Student is Eligible for the scholarship");
	 }else {
		 System.out.println("Student is Not Eligible for the scholarship");
	 }
 }
}
