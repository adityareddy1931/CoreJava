package com.logicpractice;

public class PrimeNotPrime {
	
		int num;
		int count=0;
		void Prime() {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
				 count++;
				}
			}
			if(count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
		public static void main(String[] args ) {
			PrimeNotPrime A=new PrimeNotPrime();
			A.num=5;
			A.Prime();
			
	}

}
