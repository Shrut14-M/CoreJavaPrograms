package com.ListAndSet;

import java.util.HashSet;

public class UniquesnessTest {
public static void main(String[] args) {
	HashSet<Integer> h= new HashSet();
//	Duplicates are not displayed at console
	h.add(5);
	h.add(15);
	h.add(5);
	h.add(24);
	h.add(50);
	
	for (Object obj : h) {
		System.out.println(obj);
	}
	
}
}
