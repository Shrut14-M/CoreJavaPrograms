package com.scanner;

import java.util.Scanner;

public class PercentageToGrade {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	StudentDetails st= new StudentDetails(12, "saket shinde" , "java", 56);
	st.calculateGrades();
	System.out.println("Enter your student Id");
	
	int studId= s.nextInt();
	s.nextLine();
	
	System.out.println("Enter your name");
    String Name= s.nextLine();
    
	
	System.out.println("Enter course name");
    String course= s.nextLine();
	
	
	System.out.println("Enter percentage");
    int percentage= s.nextInt();
	s.nextLine();
	
	System.out.println("The grades is " + st.calculateGrades());
}
}