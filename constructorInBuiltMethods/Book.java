package com.constructorInBuiltMethods;

public class Book {
	String title;
	String author;
	int Price;

	public Book(String title, String author, int Price) {
		this.title=title;
		this.author=author;
		this.Price=Price;
		
	}

	@Override
	public String toString() {
		return "BookDetails [title=" + title + ", author=" + author + ", Price=" + Price + "]";
	}
}
