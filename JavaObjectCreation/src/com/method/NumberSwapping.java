package com.method;

public class NumberSwapping {
public static void swap(int a, int b) {
	a= a+b; // for ex. a=5+3=8
	b=a-b; //  b= 8-5=3
	a=a-b; //  a=8-3=5
	System.out.println(a);
	System.out.println(b);
	
}
public static void main(String[] args) {
	NumberSwapping.swap(54, 23);
}
}
