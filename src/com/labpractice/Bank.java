package com.labpractice;

public class Bank {
	static long Accno=123456789;//static
	 String AccountHolderName;
	 double BankBalance;
	 long Accnoo;
	
	{
		 Accnoo= Accno++;//loop block
		
	}
	 
	 void basic() {
		 System.out.println(AccountHolderName);
		 System.out.println(BankBalance);  //method instance
		 System.out.println(Accnoo);
	 }
	 
	 
	public static void main(String[] args) {
		Bank obj1=new Bank();                //objects declarations
		obj1.AccountHolderName="aditya";
        obj1.BankBalance=20000.0;
        Bank obj2=new Bank();
        obj2.AccountHolderName="mouli";
        obj2.BankBalance=20000.0;
        
        Bank obj3=new Bank();
        obj3.AccountHolderName="reddy";
        obj3.BankBalance=20000.0;
        obj1.basic();
        obj2.basic();
        obj3.basic();  // instilizations
	}

}
