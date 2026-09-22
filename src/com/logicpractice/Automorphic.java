package com.logicpractice;

import java.util.Scanner;

public class Automorphic {
   static  void display(int num) {
	   int sum=num*num;
	   for(int i=1;i<=num;i++) {
		   int count=0;
		   for(int j=1;j<=i;j++) {
			   int rem=sum%100;
			   count=count+rem;
		   }
		   if(count==num) {
			   System.out.println("yes");
			   break;
		   }
		   else {
			   System.out.println("no");
			   break;
	
		   }
	   
	   }
	   
   }
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=Sc.nextInt();
        display(num);
	}

}
