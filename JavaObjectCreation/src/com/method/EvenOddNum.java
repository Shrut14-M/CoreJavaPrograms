package com.method;

public class EvenOddNum {
	public static void even(int n) {
		if(n%2 == 0) {
			System.out.println("The no. is Even");
		}
		else {
			System.out.println("The no. is Odd");
		}
		
	}
	public static void main(String[] args) {
		EvenOddNum.even(12);
		EvenOddNum.even(5);
		EvenOddNum.even(45);
	}
}

