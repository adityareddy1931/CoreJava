package com.logicpractice;

public class Test {

    int method1(int a, int b) {
        int result = a + b;
        System.out.println("Method1 - Addition: " + a + " + " + b + " = " + result);
        return method2(a, 20);
    }

    int method2(int a, int b) {
        int result = a - b;
        System.out.println("Method2 - Subtraction: " + a + " - " + b + " = " + result);
        return method3(a, 5);
    }

    int method3(int a, int b) {
        int result = a * b;
        System.out.println("Method3 - Multiplication: " + a + " * " + b + " = " + result);
        return method4(a, 2);
    }

    int method4(int a, int b) {
        int result = a / b;
        System.out.println("Method4 - Division: " + a + " / " + b + " = " + result);
        return result; 
    }

    public static void main(String[] args) {
        Test obj = new Test();
        // Call only first method, it will chain all
        int finalResult = obj.method1(100, 50);
        System.out.println("Final Returned Value: " + finalResult);
    }
}