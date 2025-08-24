package com.ListAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(45);
		li.add("Sakshi");
		li.add(6);
		li.add(9);
		li.add("Prerna");
		li.add(45);
		li.add(9);
		li.add("Sakshi");

		System.out.println("List without removing the duplicate elements : " + li);

		System.out.println();
		Set data= new HashSet(li);
		System.out.println("List after using the duplicate elements : " + data);
		
//		Iteratively display of data
		for (Object obj : data) {
			System.out.println(obj);
		}
	}
}
