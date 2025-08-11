package com.scanner;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a number");
	int a = s.nextInt();
	
	CheckPrime c = new CheckPrime();
	c.primeOrNot(a);
}
}