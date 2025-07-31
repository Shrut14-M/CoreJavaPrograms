package com.constructor;

public class CarDetails {
	public CarDetails(String Brand, String Model, String Price) {
		System.out.println(Brand);
		System.out.println(Model);

		System.out.println(Price);

	}

	public static void main(String[] args) {
		CarDetails c = new CarDetails("BMW", "iX1", "4CR");
		System.out.println("     ");
		CarDetails c1 = new CarDetails("Mercedes Benz", "A-Class", "5CR");

	}

}
