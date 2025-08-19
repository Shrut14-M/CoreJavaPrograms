package com.encapsul;

public class CarDetails {
	private String Name;
private String model;
private int year;
private int price;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
	if(price<=0) {
		System.out.println("Warning : The price of the car cannot be set below zero");
	}
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}

}
