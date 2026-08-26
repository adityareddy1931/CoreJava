package com.logicpractice;
import java.util.Scanner;
public class Lagestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		int a=sc.nextInt();
		System.out.println("enter the value b");
		int b=sc.nextInt();
		System.out.println("enter the value c");
		int c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is largest");
		}
		else if(b>a&&b>c) {
			System.out.println("b is largest");
		}
		else{
			System.out.println("c is largesr");
		}
		sc.close();
		
		}

	}

