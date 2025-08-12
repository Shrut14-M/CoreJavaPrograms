package com.mock;

import java.util.Scanner;

public class Authentication {
	public void authentication() {
	final String PASSWORD= "1404";
	Scanner s= new Scanner(System.in);
	int attempts= 0;
	String input;
	
	while(true) {
		System.out.println("Enter the password");
	    input =  s.nextLine();
		attempts++;
		
		if (input.equals(PASSWORD)) {
			System.out.println("Login Successfull");
			break;
		} else {
			System.out.println("Incorrect password");
			System.out.println("Attempts : "+ attempts);
		}
	}
}
}
