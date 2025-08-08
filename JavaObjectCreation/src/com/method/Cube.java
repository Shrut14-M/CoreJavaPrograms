package com.method;

public class Cube {
public static void cubeOfNum(int n) {
	int cube= n*n*n;
	System.out.println(cube);
	
}
public static void main(String[] args) {
	Cube.cubeOfNum(2);
	Cube.cubeOfNum(24);
	Cube.cubeOfNum(3);
}
}
