package com.labpractice;

public class Basics {
	byte a=20;
	short b=30;
	long c= 9014149065l;
	void display() {
		System.out.println(a + " "+ b+" "+ c);
		
	}
	

	public static void main(String[] args) {
		Basics A=new Basics();
		A.display();
    }
}