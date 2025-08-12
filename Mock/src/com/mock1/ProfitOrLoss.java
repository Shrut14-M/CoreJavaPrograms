package com.mock1;

public class ProfitOrLoss{
int numberOfbeetsSold;
int costPerBeetSold;
int SellingPricePerBeet;

public ProfitOrLoss(int x,int y,int z) {
	this.numberOfbeetsSold=x;
	this.costPerBeetSold=y;
	this.SellingPricePerBeet=z;
	
	System.out.println("Enter x : "+x);
	System.out.println("Enter y: "+ y);
	System.out.println("enter z : "+z);
}
	
public void profitOrLoss() {
	int totalCost= numberOfbeetsSold* costPerBeetSold;
	int totalrevenue= numberOfbeetsSold*SellingPricePerBeet;
	int profitOrLoss= totalrevenue-totalCost;
	
	if(profitOrLoss>0) {
		System.out.println("profit : "+profitOrLoss);
	}else if(profitOrLoss<0) {
		System.out.println("Loss ;"+profitOrLoss);
	}else {
		System.out.println("NO Profit No Loss");
	}
}

public static void main(String args[]) {
	ProfitOrLoss m= new ProfitOrLoss(5,5,7);
	m.profitOrLoss();
}
}

