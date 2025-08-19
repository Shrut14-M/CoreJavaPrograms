package com.encapsul;

public class Book {
public static void main(String[] args) {
	BookDetails b= new BookDetails();
	b.setBookName("Lallan sweets");
	System.out.println("Name of the Book is "+b.getBookName());
	
	b.setAuthor("Srishti choudhary");
	System.out.println("Name of the author is " +b.getAuthor());
	
	b.setPrice(-23);
	System.out.println("Price Of this book is "+b.getPrice());
	
	b.setPublishedYear(2021);
	System.out.println("Published year of this book is "+b.getPublishedYear());
}
}
