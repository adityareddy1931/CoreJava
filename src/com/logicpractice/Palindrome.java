package com.logicpractice;

public class Palindrome {
	int  num;
	int ans=0;

	void CheckPalindrome() {
		int orginal=num;
		while(num>0) {
			int rem=num%10;
			 ans= (ans*10)+rem;
			 num=num/10;
			
		}
		if(ans==orginal) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	

	public static void main(String[] args) {
		Palindrome A=new Palindrome();
		A.num= 121;
		A.CheckPalindrome();
		

	}

}
