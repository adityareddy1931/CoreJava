package com.logicpractice;
public class Reversenum {
	int num;
	int count=0;
	void Reverse() {
		while(num>0) {
			int rem=num%10;
			count=(count*10)+rem;
			num=num/10;
			
		}
		System.out.println(count);
	}
	public static void main(String []args) {
		
		Reversenum A=new Reversenum();
		A.num=123345;
		A.Reverse();
		
		
	}
	
}