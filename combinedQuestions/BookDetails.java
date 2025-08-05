package com.combinedQuestions;

public class BookDetails {
	int bookId;
	String bookAuthor;
	String title;
	int price;
	int availableCopies;

	public BookDetails(int bookId, String bookAuthor, String title, int price, int availableCopies) {
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.title = title;
		this.price = price;
		this.availableCopies = availableCopies;

	}

	public void issuedBooks(int copies) {
		if (availableCopies > 0) {
			if (availableCopies > copies) {
				availableCopies -= copies;
				System.out.println("number of copies issued are " + copies);
			} else {
				System.out.println("The copies are out of stock");
			}
		} else {
			System.out.println("Number of available copies must be greater than zero");
		}
	}

	public void returnedBooks(int copies) {
		if (availableCopies > 0) {
			availableCopies += copies;
			System.out.println("Number of Returned copies are " + copies);

		} else {
			System.out.println("The returned copies must be greater than zero ");
		}
	}

	public void displayBookDetails() {
		System.out.println("The book id is " + bookId);
		System.out.println("The author of this book is " + bookAuthor);
		System.out.println("The title of this book is " + title);
		System.out.println("The price of this book is " + bookId);
		System.out.println("Available copies of this book are " + availableCopies);

	}
}
