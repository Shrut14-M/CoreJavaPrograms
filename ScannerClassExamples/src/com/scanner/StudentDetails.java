package com.scanner;

public class StudentDetails {
	int studentId;
	String studentName;
	String course;
	int percentage;
	
	public StudentDetails(int studentId, String studentName, String course, int percentage) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
		this.percentage=percentage;
	}
	
	public String calculateGrades() {
		if(percentage<=100 && percentage>90) {
			return "A";
		}
		else if(percentage<=90 && percentage>80) {
			return "B";
		}
		else if(percentage<=80 && percentage>70) {
			return "c";
			}
		else if(percentage<=70 && percentage>60) {
			return "d";
		}
		else if(percentage<=60 && percentage>50) {
			return "E";
		}
		else {
			return "F";
		}
	}
	

}
