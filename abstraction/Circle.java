package com.abstraction;

public class Circle extends Shape {
public void calculateArea(int length, int breadth,int r) {
	double area= 3.14*r*r;
	System.out.println("Area of Circle is "+area);
	}
}
