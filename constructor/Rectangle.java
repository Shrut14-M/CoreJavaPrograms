package com.constructor;

public class Rectangle {
public Rectangle(int lenght,int width) {
	int area= lenght*width;
	System.out.println("Area of rectangle is= "+ area);
}
public static void main(String[] args) {
	Rectangle r= new Rectangle(21,20);
}
}
