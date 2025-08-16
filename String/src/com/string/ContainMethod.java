package com.string;

import java.util.Scanner;

public class ContainMethod {
	public static void main(String[] args) {
		System.out.println("enter the email");
		Scanner s = new Scanner(System.in);
		String email = s.nextLine();
		System.out.println("checking if it has gmail in it.");
		if (email.contains("gmail")) {
			System.out.println("It Contains Gmail");
		} else {
			System.out.println("It doesn't contain gmail");
		}
		
		
		System.out.println("checking if it has yahoo in it.");

		if (email.contains("yahoo")) {
			System.out.println("It contains yahoo");
		} else {
			System.out.println("It doesn't contain yahoo");
		}

	}
}
