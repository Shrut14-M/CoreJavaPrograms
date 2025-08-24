package com.ListAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
public static void main(String[] args) {
	List data= new ArrayList();
	data.add("Shruti");
	data.add(45);
	data.add(4.5);
	data.add("Manoorkar");
	data.add("Shruti");
	data.add(true);
	data.add("Shruti");
	
	System.out.println("Original List " +data);

	Set s= new HashSet(data);
//	System.out.println("Converted List " +s);
	
	System.out.println("Converted List is: ");
	for (Object obj : s) {
		System.out.println(obj);
	}
}
}
