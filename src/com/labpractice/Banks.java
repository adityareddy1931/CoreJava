package com.labpractice;


public class Banks {
	static String bankname;
	int AccNumBal=1000;
	int Amount;
	
	void deposit() {
		AccNumBal += Amount;
		System.out.println("AccBal after deposit:"+ AccNumBal);
	}
	void withhdraw() {
		AccNumBal -= Amount;
		System.out.println("AccBal afer withdrawn:"+ AccNumBal);
	}
	void checkBal() {
		System.out.println("Available Balance:" +AccNumBal);
	}

	public static void main(String[] args) {
          Banks b = new Banks();
          b.Amount=200;
          b.deposit();
          b.Amount=100000;
          b.withhdraw();
          b.checkBal();
          
	}

}