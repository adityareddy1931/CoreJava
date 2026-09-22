package com.operator;
import java.util.Scanner;
public class TernoryOpps2 {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the Year");
        	int Year=sc.nextInt();
        	String result = (Year % 400 == 0) ? "Leap Year" :
                (Year % 100 == 0) ? "Not Leap Year" :
                (Year % 4 == 0)   ? "Leap Year" : "Not Leap Year";
        	System.out.println(result);
        }
        
}
