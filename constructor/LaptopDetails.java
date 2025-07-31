package com.constructor;

public class LaptopDetails {
public LaptopDetails(String Brand, String ram, int Storage) {
	System.out.println(Brand);
	System.out.println(ram);

	System.out.println(Storage);

	
}
public static void main(String[] args) {
	LaptopDetails l=new LaptopDetails("HP", "8GB", 512);
	
}
}
