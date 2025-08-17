package com.abstraction;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Calculation of area of Circle and Rectangle");
	System.out.println("Enter the radius");
	int r= s.nextInt();
	
	System.out.println("Enter the length");
	int length=s.nextInt();
	
	System.out.println("Enter the breadth");
	int breadth= s.nextInt();

	Circle c= new Circle();
	c.calculateArea(length, breadth, r);
	
	Rectangle R= new Rectangle();
	R.calculateArea(length, breadth, r);	
}
}
