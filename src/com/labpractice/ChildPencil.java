package com.labpractice;
public class ChildPencil {
void remaining() {
    int  user_money=100;
    int pencil_cost=7;
    int nop=14;
    System.out.println("how many pencils he want to buy :" + nop );
    System.out.println("the cost of the pencil :" +pencil_cost);
    int amt=pencil_cost*nop;
    System.out.println("the total cost :" + amt);
    int balance=user_money-amt;
    System.out.println("the balance after the buying :" +balance);
    
   }  
    
	public static void main(String[] args) {
		
		ChildPencil A=new ChildPencil();
		A.remaining();
		

	}

}
