package com.constructor;

public class ProductDetails {

	public ProductDetails(int productId, String productName, String price) {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);

	}

	public static void main(String[] args) {
		ProductDetails p = new ProductDetails(431, "cetaphil", "413rs");
		System.out.println("     ");

		ProductDetails p1 = new ProductDetails(122, "Dot&Key Sunscreen", "399rs");

	}
}
