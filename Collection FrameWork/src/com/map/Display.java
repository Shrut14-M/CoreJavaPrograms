package com.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Display {
	public static void main(String[] args) {
//		Insertion order not followed.
//		Duplicate keys are not allowed.
//		Duplicate values are allowed.
		HashMap<Integer, String> hash = new HashMap();
		hash.put(1, "Shruti");
		hash.put(5, "Geeta");
		hash.put(2, "Shruti");
		hash.put(6, "Shrutika");
		hash.put(3, "Aashvi");
		hash.put(4, "bhavana");
		hash.put(7, null);
		hash.put(null, "EmpId");
		hash.put(null, "EmpName");  //null is allowed only once i.e. it displays the last one entry.



		System.out.println("Display key-value pair without using loop");
		System.out.println(hash);
		System.out.println();

		System.out.println("Display key-Value pair");
		for (Entry<Integer, String> data : hash.entrySet()) {
			System.out.println(data);
		}

		System.out.println();
		System.out.println("Keys are Displayed");
		for (Integer keys : hash.keySet()) {
			System.out.println(keys);
		}

		System.out.println();
		System.out.println("Values are Displayed");
		for (String values : hash.values()) {
			System.out.println(values);
		}

		System.out.println("Fetch value of key 3");
		System.out.println(hash.get(3));
		System.out.println();

//		without using loop or iteration
		System.out.println("KeySet : " + hash.keySet());
		System.out.println("valueSet : " + hash.values());
		
//		checks if the key present in the map or not
        System.out.println(hash.containsKey(6));
//      checks if the values present in the map or not.
		System.out.println(hash.containsValue("Radhika"));
		
		System.out.println(hash.remove(6));   //removing key 6 which automatically removes value.
		
		System.out.println(hash.remove(1, "Shruti"));   //removes key 1 and value Shruti.
		
		System.out.println(hash.replace(2, "radha"));  //Replaces Shruti with radha.
		System.out.println(hash);



	}
}
