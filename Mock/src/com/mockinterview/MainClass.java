package com.mockinterview;
//Using getters and setters methods

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person();
		String name = p.name("Shruti");
		System.out.println("Name :  " + name);
		String address = p.address("Pune");
		System.out.println("Address :  " +address);

		Student s = new Student();
		int marks = s.marks(95);
		System.out.println("Marks : " + marks);
		int rollNo = s.rollNo(21);
		System.out.println("RollNo :  " + rollNo);
		Scholarship s1 = new Scholarship();
		s1.scholarship(s);

	}
}
