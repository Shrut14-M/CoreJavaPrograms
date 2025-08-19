package com.encapsul;

public class EmployeeDetails {
private int empId;
private String empName;
private int salary;
private String department;

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId=empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName= empName;
	
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary=salary;
	if(salary<10000) {
		System.out.println("Warning: The salary should not be less than 10,000rs");
	}
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department=department;
}
}
