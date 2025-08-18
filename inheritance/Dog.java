package com.inheritance;

public class Dog extends Animal {
	public void bark() {
		System.out.println("Dogs have tendency to bark");
	}
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.bark();
		d.eat();
	}

}
