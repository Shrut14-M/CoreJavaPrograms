package com.encapsul;

public class Account {
	private int accountNo;
	private String accHolder;
	private int balance;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
		// return accountNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited amount is " + amount);
			System.out.println("Total balance after depositing the cash is " + balance + "rs");
		}
		else {
			System.out.println("The amount to be deposit must be greater than zero");
		}
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("withdrawed amount is "+ amount);
			System.out.println("Total balance after withdrawing the cash is "+ balance+ "rs");
		}
		else if(amount<0) {
			System.out.println("The amount cannot be less than zero");
		}
		else {
			System.out.println("insufficient balance");
		}
	}

}
