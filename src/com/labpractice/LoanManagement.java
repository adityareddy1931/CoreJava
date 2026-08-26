package com.labpractice;

public class LoanManagement {
	String customerName;
	double loanAmount;
	double intrestRate;
	int loanTenure;
	double calculateIntrest() {
		double simpleIntrest=0;
		if(loanAmount<100000000) {
			System.out.println("loan accepted");
			simpleIntrest=(loanAmount*intrestRate*loanTenure)/100;
			System.out.println("the simple intrest of the loanAmount is :"+simpleIntrest);
		}
		else {
			System.out.println("loan ammount limit is denied");
		}
		return simpleIntrest;
		
	}
	double calculatetotalAmount(double simpleIntrest) {
		double totalAmount=loanAmount+simpleIntrest;
		System.out.println("total loanAmount is:"+loanAmount);
		return totalAmount;
	}
	double monthlyInterest(double totalAmount) {
		double monthlyEmi=totalAmount/loanTenure;
		System.out.println("the monthly emi is:"+monthlyEmi);
		return monthlyEmi;
	}
	void displayLoanSummery() {
		System.out.println("the customer Name:"+customerName);
		System.out.println("the  lone amount : "+loanAmount);
		System.out.println("lone intrest rate:"+intrestRate);
		System.out.println("the  lone tenure : "+loanTenure);
	}

	public static void main(String[] args) {
		
		LoanManagement A=new LoanManagement();
		A.customerName="aditya";
		A.loanAmount=100000;
		A.intrestRate=8;
		A.loanTenure=3;
        A.displayLoanSummery();
        double simpleInterest = A.calculateIntrest();
        double totalAmount = A.calculatetotalAmount(simpleInterest);
        A.monthlyInterest(totalAmount);
	}

}
