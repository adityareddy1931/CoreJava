package com.logicpractice;

import java.util.Scanner;

public class StrongNum {
 static int Factorial(int n) {
	  int res=1;
	 
	  	 for(int i=1;i<=n;i++) {
	  	 res=res*i;
		 }
	  return res;	
}
 static void   Strong(int num) {
	 int sum=0;
	 int temp=num;
	 while(temp!=0) {
		 int rem=temp%10;
		 sum=sum+Factorial(rem);
		 temp=temp/10;
		 
	 }
	 if(sum==num) {
		 System.out.println("is Strong");
	 }
	 else {
		 System.out.println("not strong");
	 }
 }
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=Sc.nextInt();
		int result=Factorial(num);
		System.out.println(result);
		Strong(num);
		
	}

}
