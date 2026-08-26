package com.methods;
//return type with  no argument
public class Addition {
	int x=10;
	int y=20;
    int add(){
    	int c=x+y;
    	System.out.println(c);
    	return c;
    }
	public static void main(String[] args) {
	   Addition A=new Addition();
	   int result=A.add();
	   System.out.println(result);

	}

}
