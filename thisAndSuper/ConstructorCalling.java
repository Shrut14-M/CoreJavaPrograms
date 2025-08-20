package com.thisAndSuper;

public class ConstructorCalling {
public ConstructorCalling() {
	System.out.println("it's a non-parameterized constructor.");
}

public ConstructorCalling(int a, int b) {
	this();
	int c=a+b;
	System.out.println("It's a parameterized Constructor and Addition of the variables is "+c);
}
}
