package com.abstraction;

public class Truck extends Vehicle {

	@Override
	public void move() {
		System.out.println("Truck moves slower than Bike");
	}

}
