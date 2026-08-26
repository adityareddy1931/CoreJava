package com.labpractice;
import java.util.Scanner;
public class Zoomcar {
	int perDayRent() {
		int rentperday=1500;
		return rentperday;
	}
	int insurence() {
		int insurense=500;
		return insurense;
	}
	int noOfDays(int days) {
		return days;
	}
	double totalamount(int perdayrent,int nofdays,int insurence) {
		double total=perdayrent*nofdays+insurence;
		return total;
	}
	void display(String nameofcom,String name,int perdayrent,int nofdays,int insurence,double total) {
		System.out.println("name of the company="+nameofcom);
		System.out.println("cutomer name="+name);
		System.out.println("rent per day="+perdayrent);
		System.out.println("no of days="+nofdays);
		System.out.println("insurence="+insurence);
		System.out.println("total amount="+total);
	}
        
	 
	public static void main(String[] args) {
		Zoomcar A=new Zoomcar();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no of days");
		int days=sc.nextInt();
		System.out.println("--------------------------------------");
		int r1=A.perDayRent();
		int r2=A.insurence();
		int r3=A.noOfDays(days);
		double r4=A.totalamount(r1, r3, r2);
		A.display("Zoom Car","Aditya reddy", r1, r3, r2, r4);
		System.out.println("--------------------------------------");
        
	}

}
