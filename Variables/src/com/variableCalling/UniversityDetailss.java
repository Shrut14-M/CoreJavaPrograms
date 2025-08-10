package com.variableCalling;

public class UniversityDetailss {

	public static void main(String[] args) {
		University uni = new University();
		System.out.println("Name of the university is= " + (uni.universityName = "DBATU"));
		System.out.println("Location of the ini is= " + (uni.location = "Lonere"));
		System.out.println("Num of students= " + (uni.numStudents = 3242453));
		System.out.println("Num of professors= " + (uni.numProfessors = 1000));
		System.out.println("Rank Of uni is= " + (uni.ranking = 23));
		System.out.println("Founding Yr Of Uni is= " + (uni.foundingYear = 1887));
		System.out.println("Department is= " + (uni.department = "Engineering"));
		System.out.println("Gradulation Level is=" + (uni.graduationLevel = "UG and PG"));

		System.out.println("----------------------------------");

		System.out.println(uni.universityName = "SPPU");
		System.out.println(uni.location = "Pune");
		System.out.println(uni.numStudents = 1242453);
		System.out.println(uni.numProfessors = 5000);
		System.out.println(uni.ranking = 12);
		System.out.println(uni.foundingYear = 1800);
		System.out.println(uni.department = "Engineering");
		System.out.println(uni.graduationLevel = "UG and PG");

	}
}

/*
 * if we take classes in different packages while variable calling then public
 * keyword has to be used Otherwise declare the classes in the same package.
 */
