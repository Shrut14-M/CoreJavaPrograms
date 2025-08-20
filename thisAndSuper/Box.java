package com.thisAndSuper;

public class Box {
	int length;
	int width; 
	int heigth;

public void calculateVolume(int length, int width, int heigth) {
	this.length= length;
	this.width= width;
	this.heigth= heigth;
	System.out.println("Length is "+length);
	System.out.println("width is "+width);
	System.out.println("Heigth is "+heigth);
	int volume= length* width*heigth;
	System.out.println("Volume of the box is "+volume);
	

	

	

}
}
