package com.scanner;

public class CheckPrime {
public void primeOrNot(int a) {
	int temp = 0;
	for(int i=2;i<=a;i++) {
	if(a % 2==0) {
		temp= temp+1;
	}
	}
	if(temp>0) {
		System.out.println("Given Number is not prime");
	}
	else {
		System.out.println("Given Number is prime");
	}
}
}
