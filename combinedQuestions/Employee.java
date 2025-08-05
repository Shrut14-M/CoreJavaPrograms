package com.combinedQuestions;

public class Employee {
 int empId;
 String empName;
 String designation;
 int salary;
 
 public Employee(int empId, String empName, String designation, int salary) {
	 this.empId= empId;
	 this.empName= empName;
	 this.designation=designation;
	 this.salary= salary;
 }
 public void details() {
	 System.out.println("The employee Id is " + empId);
	 System.out.println("The employee Name is " + empName);
	 System.out.println("The Designation is " + designation);
	 System.out.println("The salary of employee is " + salary);

 }
 public void calculateBonus() {
	 if(salary<50000) {
		 System.out.println("The bonus obtained is "+ salary*0.10 );
	 }
	 else {
		 System.out.println("The bonus obtained is "+ salary*0.5);
	 }
 }
}
