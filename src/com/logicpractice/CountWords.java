package com.logicpractice;

public class CountWords {
	void display() {
 String s="my name is aditya";
 int num=s.length();
 int count=0;
 for(int i=0;i<num;i++) {
	 char ch=s.charAt(i);
	 if(ch==' ') {
		 count+=1;
	 }
	 else {
		
		 
	 }
	 System.out.print(count);
 }
 }
	public static void main(String[] args) {
		CountWords A=new CountWords();
		A.display();

	}

}
