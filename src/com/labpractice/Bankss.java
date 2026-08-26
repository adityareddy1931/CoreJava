package com.labpractice;

public class Bankss {
	static String BankName="Sbi";
	int Balance;
	void deposit() {
		Balance =Balance+10000;
		System.out.println("after the deposit="+ Balance);
		
		
	}
	void withhdraw() {
		Balance=Balance-10000;
		System.out.println("after the widrwal="+Balance);
		
	}
	void CheckBalance() {
		System.out.println("reamaining balance="+Balance);
	}
	

   public static void main(String[] args) {
        
	   Bankss A =new Bankss();
	   A.Balance=100;
	   System.out.println("the account balance is="+A.Balance);
	   A.deposit();
	   A.withhdraw();
	   A.CheckBalance();
          
	}

}
