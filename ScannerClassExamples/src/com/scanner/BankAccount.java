package com.scanner;

import java.util.Scanner;

public class BankAccount {
	int initialBalance=0;
	
	public void CreateAccount(String userName, int initialBalance) {
		System.out.println("The Name of accountHolder is " + userName);
		System.out.println("The initial balance in account is " + initialBalance);

	}

	public void depositMoney(double amount, int initialBalance) {
		System.out.println("Deposited money is " + amount);

		if (amount > 0) {
			initialBalance+=amount;
			System.out.println("Total balance after deposited amount is "+initialBalance);
		} else {
			System.out.println("The deposited amount must be greater than Zero");
		}

	}

	public void withdrawedMoney(double amount,int initialBalance) {
		System.out.println("withdrawed money is " + amount);

		if (amount <initialBalance) {
			initialBalance-=amount;
			System.out.println("Total balance after withdrawing the amount is "+initialBalance);
		} else if (initialBalance == 0) {
			System.out.println("Insufficient Balance in account");
		} else {
			System.out.println("The withdrawed amount must be more than zero");
		}
	}
}
