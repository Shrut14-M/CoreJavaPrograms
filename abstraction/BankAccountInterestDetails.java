package com.abstraction;

import java.util.Scanner;

public class BankAccountInterestDetails {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the initial Balance");
	int initialBal = s.nextInt();
	
	
	System.out.println("Enter the Amount to deposit");
	int amount= s.nextInt();
	
	Interest i= new Interest();
	System.out.println();
	i.deposit(amount,initialBal);
	
	System.out.println("Enter the Amount to withdraw");
	double amount1= s.nextDouble();
	i.withdraw(initialBal, amount1);
	
	System.out.println("Enter the rate of Interest");
	int rate = s.nextInt();
	
	System.out.println("Enter the TimePeriod");
	int timePeriod = s.nextInt();
	i.calculateInterest(initialBal,rate, timePeriod);
	
	}
}
