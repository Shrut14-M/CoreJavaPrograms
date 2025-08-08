package com.objectCreation;

public class Calculator {
public static void main(String args[]) {
	Addition a= new Addition();
	a.myAdd(23, 20);
	a.myAdd(20, 20);
	a.myAdd(10, 30);
	Substraction s= new Substraction();
	s.mySub(20, 10);
	s.mySub(10, 5);
	Multiplication m= new Multiplication();
	m.myMulti(2,3);
	m.myMulti(2,5);
	Division d= new Division();
	d.myDiv(20, 10);
	d.myDiv(20, 5);
	
	}
}
