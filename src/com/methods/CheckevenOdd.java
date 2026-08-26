package com.methods;

public class CheckevenOdd {
 String nums(int num) {
	 if(num%2==0) {
		return "even";
	 }
	 else {
		 return "odd";
	 }
	
 }
	public static void main(String[] args) {
		CheckevenOdd A=new CheckevenOdd();
		String result=A.nums(21);
		System.out.println(result);

	}

}
