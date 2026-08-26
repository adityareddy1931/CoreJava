package com.labpractice;

public class Arthamatic {
    int add(int a, int b) {
    	System.out.println(sub(2,4));
    	return a+b;
    	
    }
    int sub(int a,int b) {
    	System.out.println(mult(2,2));
    	return a-b;
    }
    static int  mult(int a,int b) {
    	System.out.println(mod(10,20));
    	return a*b;
    }
    static int mod(int a,int b) {
    	return a%b;
    }
    
	public static void main(String[] args) {
		Arthamatic A=new Arthamatic();
		System.out.println(A.add(10, 30));
	}

}
