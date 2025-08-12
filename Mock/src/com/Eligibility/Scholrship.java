package com.Eligibility;
//Using Constructor
public class Scholrship {
	public Scholrship(Student s) {
		if (s.getMarks() > 90) {
			System.out.println("Eligible for scholarship");
		} else {
			System.out.println("Not Eligible for scholarship");
		}
	}
}
