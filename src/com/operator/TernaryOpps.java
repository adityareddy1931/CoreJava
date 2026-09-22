package com.operator;
import java.util.Scanner;
public class TernaryOpps {
        public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int num1=Sc.nextInt();
		System.out.println("enter the number=");
		int num2=Sc.nextInt();
		System.out.println("enter the number=");
		int num3=Sc.nextInt();
		String result = num1>num2&&num1>num3 ?"A is big":num2>num1&&num2>num3 ? "B is big ":"c is big";
		System.out.println(result);
		

	}

}
