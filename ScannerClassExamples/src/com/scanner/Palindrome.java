package com.scanner;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Number ");
	int num = s.nextInt();
	
	FindPalindrome f = new FindPalindrome();
	f.palindromeNum(num);
	}
}
