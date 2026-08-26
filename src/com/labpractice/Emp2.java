package com.labpractice;

public class Emp2 {
       String  empName;
       double salary=5000;
       double gst;
       double pf; 
       double netmontsal;
       void empdet() {
    	   System.out.println("name of the emp:"+empName);
       }
       void calPf() {
    	   pf=(salary*2)/100;
    	   System.out.println("monthly PF is :"+pf);
    	   
       }
       void calGst() {
    	   gst=(salary*3)/100;
    	   System.out.println("the montly GST is :"+gst);
    	   
       }
       void netMontSals() {
    	   netmontsal=salary-(gst+pf);
    	   System.out.println("The net monthly salary :"+netmontsal);
    	   
       }
       void anualGst() {
    	   double Agst= gst*12;
    	   System.out.println("anual gst is :"+Agst);
    	   
       }
       void anualPf() {
    	   double Apf=pf*12;
    	   System.out.println("anual pf is:"+Apf);
    	   
       }
       void anualSal() {
    	   double Asal= salary*12;
    	   System.out.println("anual salary:"+Asal);
    	   
       }
       void display() {
    	   empdet();
    	   calPf();
    	   calGst();
    	   netMontSals();
    	   anualGst();
    	   anualPf();
    	   anualSal();
       }
	public static void main(String[] args) {
		
               Emp2 A=new Emp2();
               A.empName="james";
               A.display();
               System.out.println("*****************************");

               Emp2 B=new Emp2();
               B.empName="james brother";
               B.display();
               
              
	}

}
