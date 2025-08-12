package com.mock;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the password");
	int pass= s.nextInt();
	Authentication a= new Authentication(pass);
	a.authentication(pass);
	
	System.out.println("Enter the password Again");

	int pass1= s.nextInt();
	a.authentication(pass);


}
}
