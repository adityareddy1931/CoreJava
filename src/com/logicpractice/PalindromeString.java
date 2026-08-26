package com.logicpractice;

public class PalindromeString {
	void display() {
	String s="MadaM";
	String temp=s;
	int num =s.length();
	String count="";
	for (int i=num-1;i>=0;i--) {
		count=count +s.charAt(i);
	}
	if(temp.equals(count)) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}

	public static void main(String[] args) {
		PalindromeString A=new PalindromeString();
		A.display();

	}

}
