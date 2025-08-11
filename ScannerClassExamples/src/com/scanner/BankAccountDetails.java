package com.scanner;

import java.util.Scanner;

public class BankAccountDetails {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
	
		System.out.println("Create an account");

		System.out.println("Enter the User name");
		String userName = s.nextLine();
		
		
		
		System.out.println("Enter the initial Balance");
		int initialBalance = s.nextInt();
		s.nextLine();
		
		BankAccount b = new BankAccount();

        b.CreateAccount(userName, initialBalance);
		
		System.out.println("Enter amount to deposit");
		double deposit=s.nextInt();
		b.depositMoney(deposit,initialBalance);
		

		
		System.out.println("Enter Amount to withdraw");
		double withdraw= s.nextInt();
		b.withdrawedMoney(withdraw,initialBalance);
		
		}
}
