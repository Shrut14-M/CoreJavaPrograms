package com.ListAndSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AlphabeticalSorting {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("India");
		l.add("Russia");
		l.add("USA");
		l.add("Israel");
		l.add("YedaPakistan");
		
//      using set
		Set data = new TreeSet(l);
		System.out.println("sorted List is " + data);
		
//		Iteratively display of data
		for (Object obj : data) {
			System.out.println(obj);
		}
	}
}
