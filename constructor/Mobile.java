package com.constructor;

public class Mobile {
public Mobile(String Brand, String Model, int price) {
	System.out.println(Brand);
	System.out.println(Model);

	System.out.println(price);

}
public static void main(String[] args) {
	Mobile m= new Mobile("Realmi", "14x",15000);
	Mobile m1= new Mobile("Redmi", "9 pro",14000);

}
}
