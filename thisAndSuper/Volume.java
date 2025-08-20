package com.thisAndSuper;

import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate Volume of the Box");
		System.out.println("enter the length");
		int length= sc.nextInt();
		System.out.println("enter the width");
		int width= sc.nextInt();

		System.out.println("enter the heigth");
		int heigth= sc.nextInt();


		Box b = new Box();
		b.calculateVolume(length,width,heigth);
	}
}
