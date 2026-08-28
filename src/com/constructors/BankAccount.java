package com.constructors;
public class BankAccount {
	//creating instance variables
 String accountHolderName;
 long accountNumber;
 double balance;
 String branch;
 
// creating parameterized constructor
 BankAccount(String accountHolderName,long accountNumber,double balance,String branch){
	 this.accountHolderName=accountHolderName;
	 this.accountNumber=accountNumber;
	 this.balance=balance;
	 this.branch=branch;
	 
 }
 //creating copy constructor
 BankAccount(BankAccount b,double balance,String branch){
	 this.accountHolderName=b.accountHolderName;
	 this.accountNumber=b.accountNumber;
	 this.balance=balance;
	 this.branch=branch;
 }
 BankAccount(BankAccount b1){
	 this.accountHolderName=b1.accountHolderName;
	 this.accountNumber=b1.accountNumber;
	 this.balance=b1.balance;
	 this.branch=b1.branch;
	 
 }
	public static void main(String[] args) {
		BankAccount b=new BankAccount("Aditya Reddy",123456789L,5000.0,"KPHB");
		b.display();
		BankAccount b1=new BankAccount(b,3000.0,"JNTU");
		b1.display();
		BankAccount b2=new BankAccount(b1);
		b2.display();
	}
	void display() {
		System.out.println("AccountHolderName:"+accountHolderName);
		System.out.println("AccountNumber:"+accountNumber);
		System.out.println("Balance:"+balance);
		System.out.println("Branch:"+branch);
		System.out.println("___________________________________");
	}

}