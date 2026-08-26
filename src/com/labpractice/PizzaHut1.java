package com.labpractice;

public class PizzaHut1 {
    static String websiteName = "Pizza Hut";
    int itemCount;
    String itemName;
    double pricePerItem;
    double totalAmount;
    String orderStatus;

    void addItem() {
        itemCount = itemCount + 1;
        totalAmount = itemCount * pricePerItem;
        System.out.println("Item added. Current count = " + itemCount);
    }

    void placeOrder() {
        System.out.println("Website: " + websiteName);
        System.out.println("Item Name = " + itemName);
        System.out.println("Total Amount = " + totalAmount);
        System.out.println("Order Status = " + orderStatus);
      
    }

    void displayCart() {
        System.out.println("Item Name = " + itemName);
        System.out.println("Items in Cart = " + itemCount);
        System.out.println("Cart Total = " + totalAmount);
    }

    public static void main(String[] args) {
        PizzaHut1 cart = new PizzaHut1();
        cart.itemCount = 5;
        cart.itemName = "Pizza";
        cart.pricePerItem = 200; 
        cart.totalAmount = cart.itemCount * cart.pricePerItem;
        cart.orderStatus = "Success";
        System.out.println("**************************************");
        cart.placeOrder();
        cart.displayCart();
        cart.addItem(); 
        cart.displayCart(); 
        System.out.println("**************************************");
    }
}
