package com.labpractice;

public class ShoppingCart {
    static String storeName="zepto";
    String customerName;
    String productName;
    double PPrice;
    int PQuant;
    int tp;
    void addProduct(String pname , double pp,int qunt) {
    	System.out.println("the product name="+pname);
    	System.out.println("thd product price="+pp);
    	System.out.println("the product quantity="+qunt);
    	
    }
    double calculateTotal(double discount) {
    	 double total=PPrice*PQuant;
    	 double finalAmount=total-(total*discount/100);
    	 return finalAmount;
    	
    }
    void displayCart() {
    	
    	System.out.println("the store name="+storeName);
    	System.out.println("the customer name="+customerName);
    	System.out.println("the product name="+productName);
    	System.out.println("the product price="+PPrice);
    	System.out.println("the quantity="+PQuant);
    	System.out.println("sub total amount="+(PPrice*PQuant));
    	
    }
    void finalAmnt(double discount) {
    	displayCart();
    	double finalAmount=calculateTotal(discount);
    	
    	System.out.println("amount after discount="+finalAmount);
    	
    
    }
	public static void main(String[] args) {
		ShoppingCart A=new ShoppingCart();
		System.out.println("********************************************");
		A.customerName="aditya";
		A.productName="earphones";
		A.PPrice=200.0;
		A.PQuant=4;
		A.finalAmnt(19);
		System.out.println("********************************************");
		ShoppingCart B=new ShoppingCart();
		B.customerName="harsha";
		B.productName="laptop";
		B.PPrice=2000000.0;
		B.PQuant=4;
		B.finalAmnt(19);
		System.out.println("********************************************");
		

	}

}
