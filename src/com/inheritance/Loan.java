package com.inheritance;

import java.util.Scanner;

public class Loan  {

	 static Scanner Sc=new Scanner(System.in);
		String getCustomerName() {
			System.out.println("enter the customer name :");
			String customerName=Sc.nextLine();
			return  customerName;
		}
		int getAge() {
			System.out.println("enter the age of customer");
			int age=Sc.nextInt();
			return age;
		}
		double getSalary() {
			System.out.println("enter the salary of the customer");
			double salary=Sc.nextLong();
			return salary;
		}
	    int getCibil() {
			System.out.println("enter the cibil of the customer");
			int  cibil=Sc.nextInt();
			return cibil;
		}
		double getRoi(){
			int  cibil=getCibil();
			double roi=15.00;
			if(cibil>=300  &&  cibil<550) {
				System.out.println("the cibil score is avaerage");
				roi=roi+2.00;
			}
			else if(cibil>=550 && cibil<650) {
				System.out.println("the cibil score is good");
				return roi;
			}
			else if(cibil>=650&&cibil<750) {
				System.out.println("the cibil is very good");
				roi=roi-2.00;
			}
			else if(cibil>=750 && cibil<900) {
				System.out.println("the cibil score is exllent");
				roi=roi-5.00;
			}
			else {
				System.out.println("not elgible");
				
			}
			return roi;
			
		}
		boolean IsAdharno() {
			System.out.println("enter the adhar number");
			String adhar=Sc.nextLine();
			boolean IsAdhar=adhar.matches("^[2-8][0-9] {11}");
			return IsAdhar;
		}
		boolean IsPan() {
			System.out.println("enter the pan number");
			String panId=Sc.nextLine();
			boolean IsPans=panId.matches("^[A-E]{5}[0-9]{4}[A-E]{1}");
			return IsPans;
		}
		
		
		public static void main(String[] args) {
			System.out.println("welcome to the soft-bank");
			Loan  A=new Loan();
			boolean IsPans=A.IsPan();
		    boolean IsAdhar=A.IsAdharno();
			String customerName=A.getCustomerName(); 
			
			System.out.println(" continue the processing........ ");
			double salary=A.getSalary();
	        int age=A.getAge();
	        double cibil=A.getCibil();
	       
	       if(IsAdhar && IsPans) {
	        if( (cibil>300 && cibil<900) && salary>800000.00 && age>18 ) {
				System.out.println("the customer is eligible for lone");
				System.out.println(A.getRoi());
			}
			else {
				System.out.println("ur are better to upgrade skills.............");
			}
	        
	       }
	       else {
	    	   System.out.println("NOT ELGIBLE");
	       }
	        
		}

	}
