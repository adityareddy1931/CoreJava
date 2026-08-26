package com.methods;
//with return types and arguments
public class Arthamaticopps {
	int add(int x,int y) {
		return x+y;	
		}
        int sub(int x,int y) {
        	return x-y;
        }
        int mult(int x,int y) {
        	return x*y;
        }
        int mod(int x,int y) {
        	return x%y;
        }
	public static void main(String[] args) {
		Arthamaticopps A=new Arthamaticopps();
		int result1=A.add(10, 20);
		int result2=A.sub(10, 20);
		int result3=A.mult(10, 20);
		int result4=A.mod(10, 20);
		System.out.println(result1 +", "+result2+" ,"+result3+" ,"+result4);
	}

}
