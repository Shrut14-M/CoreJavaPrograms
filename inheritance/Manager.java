package com.inheritance;

public class Manager extends Employee {
public void manager() {
	System.out.println("Manager extends Employee");
}
public static void main(String[] args) {
	Manager m= new Manager();
	
	m.displayPerson();
	System.out.println();
	m.display("Radhika", 23);
	System.out.println();
	m.displayEmployee("Akshita", 21);
	System.out.println();
	m.manager();
	
}


}
