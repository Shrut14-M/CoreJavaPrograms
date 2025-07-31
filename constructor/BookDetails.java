package com.constructor;

public class BookDetails {
	public BookDetails(String Title, String Author, int Price) {
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(Price);

	}

	public static void main(String[] args) {
		BookDetails b = new BookDetails("Too Good to be True", "Prajakta Koli", 150);
		System.out.println("     ");
		BookDetails b1 = new BookDetails("The Kite Runner", "Khaled Hossieni", 250);
		System.out.println("     ");

		BookDetails b2 = new BookDetails("A Thousand Splendid Suns", "khaled Hossieni", 250);
		System.out.println("     ");

		BookDetails b3 = new BookDetails("Once upon a Curfew", "Srishti chaudhary", 250);

	}
}
