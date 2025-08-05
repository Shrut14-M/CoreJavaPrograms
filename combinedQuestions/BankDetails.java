package com.combinedQuestions;

public class BankDetails {
public static void main(String[] args) {
	Bank b= new Bank(123456, "shiksha tripathi", 5000);
	b.deposit(200.00);
	b.withdraw(100.00);
	b.deposit(400.00);
	b.withdraw(6000.00);
	b.DisplayAccountDetails();
	
}
}
