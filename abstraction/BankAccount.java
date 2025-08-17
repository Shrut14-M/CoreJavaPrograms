package com.abstraction;

public abstract class BankAccount {
	public double initialBalance;
	public void deposit(double amount,int initialBalance) {
		if(amount>0) {
		initialBalance+=amount;
		System.out.println("The total amount after depositing the amount is "+initialBalance);
		}
		else {
			System.out.println("deposited amount must be greater than zero");
		}
	}
	
	public void withdraw(double amount,double initialBalance) {
		if(amount<initialBalance) {

			System.out.println(initialBalance+" balance available");
			System.out.println(amount+" Amount for withdraw");
			this.initialBalance=initialBalance-amount;

			System.out.println("The total balance after withdrawing the amount is "+initialBalance);
		}
		else {
			System.out.println("Insufficient balance");
		
		}
	}
public abstract void calculateInterest(int initialBalance, int rate, int timePeriod);
}
