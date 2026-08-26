package com.logicpractice;
public class ReverseString {
	void aditya() {
	String S="Aditya";
	int num= S.length();
	for(int i=num-1;i>=0;i--) {
		System.out.print(S.charAt(i));
		
	}
	}
	public static void main (String[]args) {
		ReverseString A=new ReverseString();
		A.aditya();
	}

}
