package com.method;

public class VowelOrConsonent {
public static void alphabet(char alpha) {
	if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U') {
		System.out.println("Alphabet is Vowel");
	}
	else {
		System.out.println("Alphabet is Consonent");
	}
}
public static void main(String[] args) {
	VowelOrConsonent.alphabet('p');
	VowelOrConsonent.alphabet('a');
	VowelOrConsonent.alphabet('O');
}
}