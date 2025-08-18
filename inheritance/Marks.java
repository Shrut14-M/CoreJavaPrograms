package com.inheritance;

public class Marks extends Student{

 public void CalculateTotal(String subject1, int marks1,String subject2,int marks2) {
	System.out.println("Subject1 is "+subject1);
	System.out.println("Marks obtained in "+subject1+ " are "+ marks1);
	 
	 System.out.println("subject2 is "+subject2);
		System.out.println("Marks obtained in "+subject2+ " are "+ marks2);
		
   int TotalMarks= marks1+marks2;
   System.out.println("Total marks in subjects are "+TotalMarks);

	 
 }
 public static void main(String[] args) {
	Marks m= new Marks();
	m.CalculateTotal("Mathematics", 45, "Science", 95);
	m.display("Manika", 34);
}
}
