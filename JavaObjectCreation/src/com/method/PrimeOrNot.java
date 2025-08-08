package com.method;

public class PrimeOrNot {
	public static void primeOrNot(int num) {
		int temp=0;
		for(int i=2; i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
			if(temp>0) {
				System.out.println("Number is not prime");
			}
			else {
				System.out.println("Number is prime");
			}
		}
	}
	public static void main(String[] args) {
		primeOrNot(9);
	}

}
