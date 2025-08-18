package com.inheritance;

public class Car extends Vehicle {
	public void drive() {
		System.out.println("Car is the sub class of vehicle class which is its parent class");
	}
	
	public static void main(String[] args) {
		Car c= new Car();
		c.drive();
		c.start();
	}

}
