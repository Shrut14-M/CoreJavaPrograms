package com.mock;

public class Authentication {

	public void authentication(int pass) {
		if (pass == 1407) {
			System.out.println("Correct password");
		} else {
			System.out.println("Incorrect password");
		}
	}
}
