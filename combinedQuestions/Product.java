package com.combinedQuestions;

public class Product {
  int productId;
  String productName;
  int price;
  int stock;
  public Product(int productId, String productName, int price, int stock) {
	  this.productId= productId;
	  this.productName= productName;
	  this.price= price;
	  this.stock= stock;
	  
  }
  public void purchaseProduct(int quantity) {
	  if(quantity>0) {
		  if(stock>=quantity) {
			  stock-=quantity;
			  System.out.println("The number of purchased items are "+ quantity);
		  }
		  else {
			  System.out.println("The items are out of stock");
		  }
	  }
		  else {
			  System.out.println("The quantity must be greater than zero ");
		  }
		  
	  }
  public void addStock(int quantity) {
	  if(quantity>0) {
		stock+=quantity;
		System.out.println("The number of items added are "+ quantity);
		}
		  else {
			  System.out.println("The Quantity must be greater than zero");
		  }
	  }
  public void displayProductDetails() {
	  System.out.println("The productId is "+productId);
	  System.out.println("The productName is "+productName);

	  System.out.println("The price is "+price);
	  
	  System.out.println("The stock is "+stock);


	  
  }
  }

