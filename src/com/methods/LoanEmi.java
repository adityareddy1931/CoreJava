package com.methods;

public class LoanEmi {
	double loanAmount(double amount) {
		return amount;
	}
	double intrest(double amount,double tensure) {
		double intrest=(amount*5*2)/100;
		return intrest;
	}
	double totalAmount(double amount,double intrest) {
		double totalamount=(amount+intrest);
		return totalamount; 
	}
	double monthlyemi(double totalamount,int tensure) {
		double monthlyemi=(totalamount/tensure);
		return monthlyemi;
	}
	void details(String name,double loanamount,double totalintrest,int tensure ,double finalamount,double monthlyemi) {
		System.out.println("customer name:"+name);
		System.out.println("loan amount:"+loanamount);
		System.out.println("total intrest applied:"+totalintrest);
		System.out.println("tensure:"+tensure);
		System.out.println("final amount:"+finalamount);
		System.out.println("monthly emi payable:"+monthlyemi);
	}

	public static void main(String[] args) {
		LoanEmi A=new LoanEmi();
		double result1=A.loanAmount(1000000);
		double result2=A.intrest(result1, 4);
		double result3=A.totalAmount(result1, result2);
		double result4=A.monthlyemi(result3, 4);
		A.details("aditya", result1, result2, 4, result3, result4);
	}

}
