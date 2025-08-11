package com.scanner;

public class ReverseNumber {
  public void reverseNum(int num) {
	  for(;num!=0;) {
	  int rev=0;
	  int rem= num%10;
	  rev = rev*10+ rem;
	  num= num/10;
	  System.out.println(rev);
	  }
	  
	  
  }
}
