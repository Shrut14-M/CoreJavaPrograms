package com.constructor;

public class Student {

	public Student(String Name, int Age) {
		System.out.println(Name);
		System.out.println(Age);
	}

//	public Student(int Name, int Age) {            //multiple constructors are allowed in same class       
//		System.out.println(Name);                  only if the parameters are different.
//		System.out.println(Age);
//	}

	public static void main(String[] args) {
		Student s = new Student("Kshitija", 24);
	}

}
