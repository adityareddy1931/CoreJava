package com.labpractice;

public class Methods {
	   static Methods obj=new Methods ();
	static void add() {
		int a=10;
		int b=20;
		System.out.println("add result=" + (a+b));
		sub();
		
	}
    static  void sub() {
    	int a=20;
    	int b=10;
    	System.out.println("sub result=" +(a-b));
    	obj.multi();
	
    }
    void multi() {
    	int a=30;
    	int b=10;
    	System.out.println("multi result="+(a*b));
    	obj.div();
    	
    	
    }
    void  div() {
    	int a=40;
    	int b=10;
    	System.out.println("div result="+(a%b));
    	
    	
    }
	public static void main(String[] args) {
		add();
		

	}

}
