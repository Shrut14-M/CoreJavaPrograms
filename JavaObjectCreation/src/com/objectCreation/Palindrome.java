package com.objectCreation;

public class Palindrome {
public void pal(int num) {
	int rev=0;
	for(;num!=0;) {
		int reminder =num%10;
		rev=rev*10+reminder;
		num=num/10;
	}
//	System.out.println(rev);
if(rev==num) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not a Palindrome");
}
}
}
