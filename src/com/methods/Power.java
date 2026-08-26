package com.methods;

public class Power {
	double totalpowerBill(double units,double unitcost){
		double totalbill=units*unitcost;
		return totalbill;
	}
	double tax(double totalbill) {
		double taxApplied =totalbill*5/100;
		return taxApplied ;
		
	}
	double finalbill(double totalbill,double taxApplied) {
		double finalbill=(totalbill+taxApplied);
		return finalbill;
	}
	void summary(String name,double finalbill) {
		System.out.println("name of the customer:"+name);
		System.out.println("the final bill amount:"+finalbill);
	}
	public static void main(String[] args) {
		Power A=new Power();
		double result1=A.totalpowerBill(350, 2);
		double result2=A.tax(result1);
		double result3=A.finalbill(result1, result2);
		A.summary("aditya",result3);
		System.out.println("actualbill is :"+result1);
		System.out.println("the tax applied is:"+result2);
		System.out.println("------------------------------");
		Power B= new Power();
		double result4=B.totalpowerBill(750, 2);
		double result5=B.tax(result4);
		B.finalbill(result4, result5);
		A.summary("ratnakar",result3);
		System.out.println("actualbill is :"+result4);
		System.out.println("the tax applied is:"+result5);
		System.out.println("------------------------------");
		
		

	}
}
