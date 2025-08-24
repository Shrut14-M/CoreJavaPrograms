package com.ListAndSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DisplayUsingIterator {
public static void main(String[] args) {
	Set<String> EmpNames = new HashSet();
	EmpNames.add("Shruti");
	EmpNames.add("Shrutika");
	EmpNames.add("Bhavana");
	EmpNames.add("Shubham");
	EmpNames.add("Darshan");

	Iterator<String> it = 	EmpNames.iterator();
	System.out.println("List of Employees: ");

	while(it.hasNext()) {
		String names= it.next();
		System.out.println(names);
		}

	
}
}
