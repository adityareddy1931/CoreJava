package com.loops;

import java.util.Scanner;

public class Febnochi {
    static void Feb() {
    	Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=Sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
	    for(int i=0;i<=num;i++){
	    	  n3=n1+n2;
	    	 System.out.print(" "+n3);
	    	 n1=n2;
	    	 n2=n3;
	    	 
	    	 
	    }
    }
	public static void main(String[] args) {
		Feb();

	}

}
