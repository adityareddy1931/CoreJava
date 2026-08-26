package com.labpractice;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the base of the triangle=" );
		int base=sc.nextInt();
		System.out.println("enter the height of the triagle=");
		int height=sc.nextInt();
		double sum=0.5*base*height;
		System.out.println(sum);
		
		
		sc.close();
		

	}

}
