package com.methods;
//total amount,fixed charges,svd amount,over all customer detaials
public class Powerbill {
	double totalunits(int units,double amount) {
		double totalbill=units*amount;
		return totalbill;
	}
	double fixedcharges(double fixedcharge) {
		return fixedcharge;
	}
	double finalbill(double totalunits,double fixedcharge) {
		double recept=totalunits+fixedcharge;
		return recept;
	}
	double svdamount(double svdcharges,double recipt,double nosvdcharges) {
		if(recipt<5000) {
			return nosvdcharges;
		}
		else {
			return svdcharges;
		}
	}
	double powerbill(double recipt,double svdcharges) {
		double powerbill=recipt+svdcharges;
		return powerbill;
	}
	void display(String name,double  readingamount,double fixedcharges,double recipt ,double svdcharges,double powerbill)
	{
		System.out.print("------------------------------------------------");
		System.out.println("Customer name="+name);
		System.out.println("Total Reading amount="+readingamount);
		System.out.println("Fixed charges for the bill="+fixedcharges);
		System.out.println("The total bill="+recipt);
		System.out.println("SVD amount to the bill="+svdcharges);
		System.out.println("The Total Final Bill="+powerbill);
		System.out.print("------------------------------------------------");
	}
	

	public static void main(String[] args) {
		Powerbill A=new Powerbill();
		double res1=A.totalunits(950, 2);
		double res2=A.fixedcharges(100);
		double res3=A.finalbill(res1, res2);
		double res4=A.svdamount(50, res3,0);
		double res5=A.powerbill(res3, res4);
		A.display("Aditya reddy", res1, res2, res3, res4, res5);

	}

}
