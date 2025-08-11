package com.scanner;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();

		EvenOdd e = new EvenOdd();
		e.m1(num);
	}
}
