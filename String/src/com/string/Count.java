package com.string;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password");
        String pass= s.nextLine();
        System.out.println("Count of the password is "+pass.length());
	}
}
