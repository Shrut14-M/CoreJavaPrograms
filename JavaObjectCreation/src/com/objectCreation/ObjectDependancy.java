package com.objectCreation;

public class ObjectDependancy {
public static int myAddition(int a,int b) {
	int c=a+b;
	System.out.println("addition is="+ c);
	return c;
	}
public static int mySubstraction(int add,int d) {
	int substract= add - d;
	System.out.println("Substraction is="+ substract);
	return substract;
}
public static int myMultiplication(int sub, int e) {
    int multi= sub*e;
    System.out.println("Multiplication is=" + multi);
    return multi;
}

public static int myDivision(int mul, int f) {
    int divi= mul/f;
    System.out.println("Division is=" + divi);
    return divi;
}


public static void main(String args[]) {
	int add =myAddition(4,5);
	int sub= mySubstraction(add,5);
	int mul= myMultiplication(sub,10);
	int div= myDivision(mul,2);
}
}
