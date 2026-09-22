package com.operator;
import java.util.Scanner;
public class TernaryOpps1 {
        public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int num1=Sc.nextInt();
		System.out.println("enter the number=");
		int num2=Sc.nextInt();
		int sum=num1+num2;
		String result = (sum>0) ?"positive" : sum<0 ?"negitive":"zero";
		System.out.println(result);
		

	}

}
