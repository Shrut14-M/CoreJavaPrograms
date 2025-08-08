package com.objectCreation;

public class ObjectCreation {
 public void object() {
	 int a=20,b=10;
	 int c=a+b;
	 System.out.println("Addition is= "+c);
 }
 public static void main(String args[]) {
	 ObjectCreation obj= new ObjectCreation();
	 obj.object();
 }
}
