package com.constructorInBuiltMethods;

public class Employee {
	int empId;
	String Name;
	int salary;
public Employee(int empId, String Name, int salary){
	this.empId= empId;
	this.Name=Name;
	this.salary=salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", Name=" + Name + ", salary=" + salary + "]";
}
}
