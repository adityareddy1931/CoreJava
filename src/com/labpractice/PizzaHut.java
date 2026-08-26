package com.labpractice;

public class PizzaHut {
          String item1;
          String item2;
          String item3;
          int ordernum;
          boolean status;
          String cart;
          int totalcart;
          void items() {
        	  item1="pizza";
        	  item2="pizza";
        	  item3="pizza";
        	  ordernum=22;
        	  cart=item1 + item2 + item3 ;
        	  System.out.println("name of the item="+item1+" ,"+item2+" ,"+item3);
        	  System.out.println("order number="+ordernum);
        	  System.out.println("order added to cart="+cart);
          }
          void cartItem() {
        	  totalcart=3;

        	  System.out.println("items added=" +totalcart);
        	  
          }
          void orderStatus() {
        	  status=true;
             System.out.println("order resived ="+status);
        	  
          }
          void display() {
        	  cartItem();
        	  orderStatus();
        	  
          }
          
	public static void main(String[] args) {
		PizzaHut A=new PizzaHut();
		A.items();
		A.display();

	}

}
