package com.labpractice;
import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = Sc.nextInt();   // input number
        int sum = 0;

        // for loop version
        for (; num > 0; num = num / 10) {
            int digit = num % 10;   // extract last digit
            sum = sum + digit;      // add digit to sum
        }

        System.out.println("Sum of digits = " + sum);
    }
}