package com.logicpractice;

public class Amstrong {

	void Amst(int num) {
		int count = 0;
		int temp=num;
		while (num > 0) {
			int rem = num % 10;
			count = count + (rem * rem * rem);
			num = num / 10;
		}
		if (temp == count) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		Amstrong A = new Amstrong();
		A.Amst(153);

	}

}
