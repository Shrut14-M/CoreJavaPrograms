package com.method;

public class ReverseNum {
public static void reverse(int n) {
	for(;n!=0;) {
	int rev=0;
	int rem= n%10;
	rev= rev*10 + rem;
	n=n/10;
	System.out.print(rev);
	}
	
}
public static void main(String[] args) {
	ReverseNum.reverse(345);
}
}
