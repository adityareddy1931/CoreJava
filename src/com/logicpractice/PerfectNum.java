package com.logicpractice;

import java.util.Scanner;

public class PerfectNum {
//	static void display(int num) {
//		int count=0;
//	for(int i=1;i<num;i++) {
//		if(num%i==0) {
//			count=count+i;
//		}
//	}
//	if(count==num) {
//		System.out.println("Perfect");
//	}
//	else {
//		System.out.println("Not perfect");
//	}
//	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		for(int j=1;j<=num;j++) {
			int count=0;
		    for(int i=1;i<j;i++) {
			if(j%i==0) {
				count=count+i;
			}
		}
		if(count==j) {
			System.out.println(j);
		}

	}

	}}
