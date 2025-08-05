package com.combinedQuestions;

public class Book {
	public static void main(String[] args) {
		BookDetails b = new BookDetails(12, "Prajakta Koli", "too good to be true", 250, 500);
		b.issuedBooks(250);
		b.returnedBooks(152);
		b.displayBookDetails();
	}
}

