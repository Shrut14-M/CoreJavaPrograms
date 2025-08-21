package com.exceptionHandling;

import java.util.Scanner;

public class ArithmeticException {
	int a;
	int b;
public void divide(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println(a/b);
	if(b==0) {
		System.out.println("cannot divide by zero");
		try {
			System.out.println();
		}
	}
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int a= sc.nextInt();
	System.out.println("Enter a number");
	int b=sc.nextInt();
	ArithmeticException e= new ArithmeticException();
	e.divide(a, b);
}
}
