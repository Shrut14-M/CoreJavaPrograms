package com.encapsul;

public class Car {
public static void main(String[] args) {
	CarDetails c= new CarDetails();
	c.setName("BMW");
	c.setModel("RV123x");
	c.setPrice(-345);
	c.setYear(1998);
	System.out.println("The name of the Car is "+c.getName());
	System.out.println("The model of the car is "+ c.getModel());
	System.out.println("The price of the Car is "+ c.getPrice()+ "rs");
	
	System.out.println("The year of launch of this car is "+c.getYear());
	
}
}
