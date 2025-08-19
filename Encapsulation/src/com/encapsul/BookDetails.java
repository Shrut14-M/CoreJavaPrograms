package com.encapsul;

public class BookDetails {
private String bookName;
private String author;
private int publishedYear;
private int price;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPublishedYear() {
	return publishedYear;
}
public void setPublishedYear(int publishedYear) {
	this.publishedYear = publishedYear;
	if(price<=0) {
		System.out.println("The price of this book cannot be set as zero or less than zero");
	}
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
