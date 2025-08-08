package com.method;

public class PositiveNegativeNum {
	public static void positiveNegative(int n) {
		if(n>0) {
			System.out.println("The number is Postive");
		}
		else if(n<0) {
			System.out.println("The number is Negative");
	}
		else{
			System.out.println("The number is Zero");
		}
	}

	public static void main(String[] args) {
		PositiveNegativeNum.positiveNegative(34);
		PositiveNegativeNum.positiveNegative(0);
		PositiveNegativeNum.positiveNegative(-34);
	}
}
