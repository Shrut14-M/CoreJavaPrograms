package com.scanner;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = s.nextInt();
	
	ReverseNumber r = new ReverseNumber();
	System.out.println("The reversed number is");
	r.reverseNum(num);
}
}
