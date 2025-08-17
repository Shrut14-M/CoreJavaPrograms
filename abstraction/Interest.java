package com.abstraction;

public class Interest extends BankAccount{

	@Override
	public void calculateInterest(int initialBalance, int rate, int timePeriod) {
		int interest= initialBalance*rate*timePeriod;
		System.out.println("The total interest is "+interest);
		
	}

}
