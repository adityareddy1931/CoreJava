package com.methods;
//no return type with arguments
public class Nameprint {
    void  customerName(String name) {
    	System.out.println(name);
    }
	public static void main(String[] args) {
		Nameprint A=new Nameprint() ;
		A.customerName("aditya");
	}

}
