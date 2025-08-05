package com.combinedQuestions;

public class Bank {
int accountNumber;
String accountHolder;
int balance;

public Bank(int accountNumber, String accountHolder, int balance) {
	this.accountNumber= accountNumber;
	this.accountHolder= accountHolder;
	this.balance= balance;
	
}
 public void deposit(double amount) {
	 if(amount>0) {
		 balance+=amount;
		 System.out.println("deposited amount is " +amount);
	 }
	 else {
		 System.out.println("deposited amount must be greater than zero");
	 }
	 
 }
 public void withdraw(double amount) {
	 if ( amount>0) {
	 if(amount<=balance) {
		 balance-=amount;
		 System.out.println("Withdrawal amount is " + amount);
		  }
	 else {
		 System.out.println("withdrawal amount must be greater than zero");
	 }
	 }
	 else {
		 System.out.println("insufficient balance");
	 }
 }
 public void DisplayAccountDetails() {
	 System.out.println("Account Number is " + accountNumber);
	 System.out.println("Account Holder is " + accountHolder);
	 System.out.println("Balance is " + balance);

 }
}
