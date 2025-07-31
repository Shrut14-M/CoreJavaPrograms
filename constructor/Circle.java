package com.constructor;

public class Circle {
public Circle(int radius) {
	float area= 3.14f * radius * radius;
	System.out.println("Area of the Circle is= " + area);
}
public static void main(String[] args) {
	Circle c= new Circle(20);
}
}
