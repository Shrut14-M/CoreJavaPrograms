package com.combinedQuestions;

public class ProductDetails {
public static void main(String[] args) {
	Product p= new Product(123, "Bodywash", 500, 20);
	p.purchaseProduct(10);
	p.addStock(23);
	p.displayProductDetails();
	
}
}
