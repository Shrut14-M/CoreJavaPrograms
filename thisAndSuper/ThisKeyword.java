package com.thisAndSuper;

public class ThisKeyword {
String name;
int age;
public ThisKeyword() {
	System.out.println("Student Details");
}
public ThisKeyword(String name) {
	this();
	System.out.println("name is "+name);
}
public ThisKeyword(String name, int age) {
	this("Shruti");
	System.out.println("name is "+name);
	System.out.println("age is "+age);
}
public static void main(String[] args) {
	ThisKeyword t= new ThisKeyword("bhavana",20);
}
}
