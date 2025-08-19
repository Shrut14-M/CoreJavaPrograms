package com.encapsul;

public class AccountDetails {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountNo(123);
		System.out.println("The account number is " + a.getAccountNo());

		a.setAccHolder("Namish");
		a.setBalance(500000);
		System.out.println("The name of account holder is " + a.getAccHolder());
		System.out.println("The total balance in " + a.getAccHolder() + " account is " + a.getBalance() + "rs");
		a.deposit(500);
		a.withdraw(200);

	}
}
