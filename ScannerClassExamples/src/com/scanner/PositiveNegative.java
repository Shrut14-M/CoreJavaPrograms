package com.scanner;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = s.nextInt();
	
	CheckPositiveNegative c = new CheckPositiveNegative();
	c.positiveOrNegative(num);
	}
}
