package com.ListAndSet;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList();
		cities.add("Nanded");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Banglore");
		cities.add("Hyderabad");

		cities.addFirst("Patna");
		cities.addLast("Kashmir");

		System.out.println("Linked List after adding Data at the beginning and end");
//		System.out.println(cities);    Direct display
		
//		Data display using ListIterator
		ListIterator<String> it = cities.listIterator();
		while(it.hasNext()) {
			String cityNames= it.next();
			System.out.println(cityNames);
		}
		
		System.out.println();
		
		System.out.print("First city of the list is : ");
		System.out.println(cities.getFirst());
		System.out.print("Last city of the list is : ");
		System.out.println(cities.getLast());

	}
}
