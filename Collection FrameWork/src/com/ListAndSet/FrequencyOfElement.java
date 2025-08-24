package com.ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencyOfElement {
	public static void main(String[] args) {	
		List<String> cities = Arrays.asList("Delhi", "Mumbai", "Delhi", "Chennai", "Mumbai", "Delhi");
		System.out.println(cities);
		System.out.println("Frequency of delhi: " + Collections.frequency(cities, "Delhi"));
		
		System.out.println();

//frequency count using set
		Set<String> city = new HashSet<>(Arrays.asList("Delhi", "Mumbai", "Delhi", "Chennai", "Mumbai", "Delhi"));
		System.out.println(city);
		System.out.println("Frequency of delhi: " + Collections.frequency(city, "Delhi"));

//      frequency count using Collection.frequency() method
		List<Integer> empId = new ArrayList();
		empId.add(3);
		empId.add(5);
		empId.add(1);
		empId.add(9);
		empId.add(3);
		empId.add(9);
		empId.add(3);
		empId.add(1);
		empId.add(4);
		empId.add(3);
		System.out.println("Frequency of");
		System.out.println("empId 3 : " + Collections.frequency(empId, 3));
		System.out.println("empId 5 : " + Collections.frequency(empId, 5));
		System.out.println("empId 1 : " + Collections.frequency(empId, 1));
		System.out.println("empId 9 : " + Collections.frequency(empId, 9));
		System.out.println("empId 4 : " + Collections.frequency(empId, 4));
		}
}
