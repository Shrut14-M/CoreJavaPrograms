package com.scanner;

public class FindPalindrome {
public void palindromeNum(int num) {
	int rev=0;
	int temp;
	temp=num;
	for(;num!=0;) {
		int rem= num%10;
		rev = rev*10+ rem;
		num= num/10;
	}
		if(rev==temp) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
		
	}
}
