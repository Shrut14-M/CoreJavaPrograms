package com.scanner;

import java.util.Scanner;

public class PrintTable {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();	
	System.out.println("Print Table of" + a);
	
	Table t = new Table();
	t.myTable(a);
}
}
