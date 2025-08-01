package com.constructorInBuiltMethods;

public class Car {
	String Brand;
	String Model;
	int Price;

	public Car(String Brand, String Model, int Price) {
		this.Brand = Brand;
		this.Model = Model;
		this.Price = Price;

	}

	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", Model=" + Model + ", Price=" + Price + "]";
	}

}
