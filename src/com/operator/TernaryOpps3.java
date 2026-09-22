package com.operator;
import java.util.Scanner;
public class TernaryOpps3 {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the S1 Marks");
		int a=Sc.nextInt();
		System.out.println("Enter the S2 Marks");
		int b=Sc.nextInt();
		System.out.println("Enter the S3 Marks");
		int c=Sc.nextInt();
		int total=a+b+c;
		String result=  total>75 ?"A grade":total>60?"B grade":total<50?"C grade":"Fail";
		System.out.println(result);

	}

}
