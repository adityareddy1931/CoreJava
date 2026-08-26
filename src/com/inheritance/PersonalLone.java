package com.inheritance;
import java.util.Scanner;
public class PersonalLone extends Lone { 
	 
	
	public static void main(String[] args) {
		System.out.println("welcome to the soft-bank");
		PersonalLone  A=new PersonalLone();
		String customerName=A.getCustomerName(); 
		System.out.println(" continue the processing........ ");
		double salary=A.getSalary();
        int age=A.getAge();
        double cibil=A.getCibil();
       
       
        if( (cibil>300 && cibil<900) && salary>800000.00 && age>18 ) {
			System.out.println("the customer is eligible for lone");
			System.out.println(A.getRoi());
		}
		else {
			System.out.println("ur are better to upgrade skills.............");
		}
        
	}

}
