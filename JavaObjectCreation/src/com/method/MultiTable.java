package com.method;

public class MultiTable {
	public static void table(int n) {
		for(int i=1; i<=10; i++) {
			int mulTable= n*i;
			System.out.println(mulTable);
			}
	}
	public static void main(String[] args) {
		MultiTable.table(29);
		
	}
}
