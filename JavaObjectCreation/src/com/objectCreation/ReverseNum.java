package com.objectCreation;

public class ReverseNum {
public void reverse(int num) {
	for(;num!=0;) {
	int rem=num%10;
	int rev=0;
	rev=rev*0+rem;
	num=num/10;
	System.out.print(rev);
	}
	
}
}
