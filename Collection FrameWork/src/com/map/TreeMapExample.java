package com.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap();
		map.put("EmpName", "Shruti");
		map.put("EmpId", "14A");
		map.put("Address", "pune");
		map.put("salary", "24LPA");
		map.put("Name", "Shruti");
//		map.put(null, "Shruti");     null key is no allowed.
		map.put("Name",null);        //null value is allowed.
//		                             Duplicate key is not allowed.

		
		System.out.println(map);
		
		System.out.println();
		
		System.out.println("Data Displayed:");
		for (Entry<String, String> str : map.entrySet()) {
			System.out.println(str);
			
		}
		
		System.out.println();
		
		System.out.println(map.get("Address"));
		System.out.println(map.firstKey());   //Returns the first key from map.
		System.out.println(map.higherKey("salary"));
		
		System.out.println(map);
	}
}
