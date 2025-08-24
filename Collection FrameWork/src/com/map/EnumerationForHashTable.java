package com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationForHashTable {
public static void main(String[] args) {
	Hashtable<Integer, String> h = new Hashtable();
	h.put(5, "EmpId");
	h.put(7, "dept");
	h.put(1, "EmpName");
	h.put(4, "EmpId");
	h.put(2, "address");
	h.put(3, "Gender");

	Enumeration <Integer> en = h.keys();
	while(en.hasMoreElements()) {
		int key= en.nextElement();
		String value= h.get(key);
		System.out.println("Key: "+ key + " value: "+ value);
	}
	
     
}
}
