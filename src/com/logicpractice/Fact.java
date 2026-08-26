package com.logicpractice;

public class Fact {
void facto(int num) {
	int count=1;
	for(int i=num;i>=1;i--) {
		count=count*i;
		System.out.println( count);
	}
	System.out.println("the final fact is :"+count);
	
}
	public static void main(String[] args) {
		Fact A =new Fact();
		A.facto(5);
		
		
	}

}
